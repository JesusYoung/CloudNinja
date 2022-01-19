package cn.com.yangshj.monitor.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Create by yangshijie on 1/19/22
 */
@Configuration
public class WebMvcConfg implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //权限拦截器
        registry.addInterceptor(urlInterceptor()).addPathPatterns("/**");
    }
    @Bean
    public URLInterceptor urlInterceptor(){
        return new URLInterceptor();
    }
}
