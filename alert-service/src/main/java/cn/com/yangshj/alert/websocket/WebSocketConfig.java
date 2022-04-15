package cn.com.yangshj.alert.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Create by yangshj on 4/13/22
 */
@Slf4j
@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        log.info("启动 websocket.......");
        return new ServerEndpointExporter();
    }
}
