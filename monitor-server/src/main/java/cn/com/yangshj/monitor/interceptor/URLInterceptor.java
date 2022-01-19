package cn.com.yangshj.monitor.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * Create by yangshijie on 1/19/22
 */
@Slf4j
public class URLInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String token = httpServletRequest.getHeader("token");
        String requestURL = httpServletRequest.getRequestURI();

        if (token == null){   //正常情况下这里还需判断与redis中的token是否匹配
            // 如果没有token或者token不匹配, 直接抛出异常  提示未登录
            log.info("aaa: token is null");

            // 返回false不再往下走
            return true;
        }

        if (requestURL != null) {
            log.info("url: " + requestURL);
        }
        return false;
    }
}
