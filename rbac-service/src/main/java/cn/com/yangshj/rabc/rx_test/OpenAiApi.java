package cn.com.yangshj.rabc.rx_test;

import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Streaming;

/**
 * @author yangshijie
 * @since 2023/4/26 14:44
 */
public interface OpenAiApi {

    @Streaming
    @POST(value = "/api/v1/team_sun/hulk/stream")
    Call<ResponseBody> stream3(@Body ChatCompletionRequest request);
}
