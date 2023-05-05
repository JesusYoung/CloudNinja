package cn.com.yangshj.rabc.rx_test;

import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.theokanning.openai.service.ResponseBodyCallback;
import com.theokanning.openai.service.SSE;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import org.springframework.context.annotation.Bean;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * @author yangshijie
 * @since 2023/4/26 14:03
 */
public class RxService {

    private static volatile Retrofit retrofit;

    /**
     * 读取超时时间
     */
    private static final int TIMEOUT_READ = 120;
    /**
     * 连接超时时间
     */
    private static final int TIMEOUT_CONNECTION = 20;

    private static OpenAiApi openAiApi;

    @Bean
    public RxJava2CallAdapterFactory rxJava2CallAdapterFactory() {
        return RxJava2CallAdapterFactory.create();
    }

    public static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(TIMEOUT_CONNECTION, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT_READ, TimeUnit.SECONDS)
            .writeTimeout(TIMEOUT_READ, TimeUnit.SECONDS)
            .build();

    private static void initRetrofit() {
        if(retrofit == null) {
            synchronized (RxService.class) {
                if(retrofit == null) {
                    retrofit = new Retrofit.Builder()
//                            .baseUrl("http://172.0.0.1:8200")
//                            .baseUrl("http://localhost:8200")
//                            .baseUrl("http://13.50.237.9:8200")
                            .baseUrl("http://54.88.95.108:8200")
                            .client(okHttpClient)
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .addConverterFactory(JacksonConverterFactory.create(defaultObjectMapper()))
                            .build();
                }
            }
        }
    }

    public static OpenAiApi createApi() {
        initRetrofit();
        if(openAiApi == null) {
            openAiApi = retrofit.create(OpenAiApi.class);
        }
        return openAiApi;
    }

    public static ObjectMapper defaultObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper;
    }



    // ================================= test =================================

    private static final ObjectMapper mapper = defaultObjectMapper();

    public static <T> Flowable<T> stream(Call<ResponseBody> apiCall, Class<T> cl) {
        return stream(apiCall).map(sse -> mapper.readValue(sse.getData(), cl));
    }

    public static Flowable<SSE> stream(Call<ResponseBody> apiCall) {
        return stream(apiCall, false);
    }

    public static Flowable<SSE> stream(Call<ResponseBody> apiCall, boolean emitDone) {
        return Flowable.create(emitter -> apiCall.enqueue(new ResponseBodyCallback(emitter, emitDone)), BackpressureStrategy.BUFFER);
    }
}
