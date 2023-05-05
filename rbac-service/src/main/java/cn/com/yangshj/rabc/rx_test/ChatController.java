package cn.com.yangshj.rabc.rx_test;

import com.theokanning.openai.completion.chat.ChatCompletionChunk;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import io.reactivex.Flowable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试流式接口
 *
 * @author yangshj
 * @since 2023/5/5 14:01
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/chat")
public class ChatController {

    @PostMapping(value = "/ttt2", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public void test2(@RequestBody ChatCompletionRequest request) {
        log.info("aaa: " + request.toString());
        Flowable<ChatCompletionChunk> flowable = RxService
                .stream(RxService.createApi().stream3(request), ChatCompletionChunk.class);

        StringBuilder sb = new StringBuilder();
        flowable.subscribe(result -> {
            log.info("result: " + result.toString());

            String re = result.getChoices().get(0).getFinishReason();
            if (ObjectUtils.isEmpty(re)) {
                if (!ObjectUtils.isEmpty(result.getChoices().get(0).getMessage().getContent())) {
                    log.info("content: " + result.getChoices().get(0).getMessage().getContent());
                    sb.append(result.getChoices().get(0).getMessage().getContent());
                }
            } else if (re.equals("stop")) {
                log.error("回答2： \n" + sb);
            } else {
                log.error("stop");
                log.error("回答： \n" + sb);
            }
        }, throwable -> {
            log.error("error: " + throwable.toString());
        }, () -> {
            log.info("complete");
            log.error("com: \n" + sb);
        });
    }
}
