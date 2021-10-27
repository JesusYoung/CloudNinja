package cn.com.yangshj.api.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class AuthFilter extends AbstractGatewayFilterFactory<AuthFilter.Config> {

    public AuthFilter() {
        super(AuthFilter.Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {


        return new GatewayFilter() {
            @Override
            public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
                ServerHttpRequest request = exchange.getRequest();
                HttpHeaders headers = request.getHeaders();
                String token = headers.getFirst(config.getTokenHeaderName());

                // 如果没有token，则不进行认证，因为可能是无需认证的API接口
                if (!StringUtils.hasText(token)) {
                   return chain.filter(exchange);
                }

                return null;
            }
        };
    }

    public static class Config {
        private static final String DEFAULT_TOKEN_HEADER_NAME = "token";

        private String tokenHeaderName = DEFAULT_TOKEN_HEADER_NAME;


        public String getTokenHeaderName() {
            return tokenHeaderName;
        }

        public void setTokenHeaderName(String tokenHeaderName) {
            this.tokenHeaderName = tokenHeaderName;
        }
    }
}
