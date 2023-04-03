package cn.com.yangshj.oauth.config.handler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 * 登录成功处理器
 *
 * @author yangshj
 * @since 2023/3/31 14:52
 */
@Slf4j
@Component
//@RequiredArgsConstructor // 构造方法
public class AuthSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    private final ObjectMapper objectMapper;

    /**
     * 构造方法
     *
     *    也可以在类上使用 @RequiredArgsConstructor 注解
     *
     * @param objectMapper objectMapper
     */
    public AuthSuccessHandler(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws ServletException, IOException {
        log.info("登录成功");
        response.setStatus(HttpStatus.OK.value());
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(this.objectMapper.writeValueAsString(authentication));
    }
}
