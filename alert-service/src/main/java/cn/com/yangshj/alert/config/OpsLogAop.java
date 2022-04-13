package cn.com.yangshj.alert.config;

import javax.servlet.http.HttpServletRequest;

import java.util.Enumeration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Create by yangshijie on 4/12/22
 */
@Aspect
@Component
public class OpsLogAop {

    @Pointcut("execution(public * cn.com.yangshj.*.controller.*.*(..))")
    public void opsLog() {
    }

    @Before("opsLog()")
    public void doBefore(JoinPoint joinPoint) throws Exception {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            System.out.println("===================> 非http请求方式!");
        } else {
            HttpServletRequest request = attributes.getRequest();
            Long start = System.currentTimeMillis();
            request.setAttribute("request-start", start);
            String method = request.getMethod();
            System.out.println("===================> 远程ip: " + request.getRemoteAddr());
            System.out.println("===================> 请求方式: " + method);
            System.out.println("===================> 请求地址: " + request.getRequestURL().toString());
            System.out.println("===================> 请求方法: " + joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName());
            StringBuilder params;

            if (method.equalsIgnoreCase("get")) {
                params = new StringBuilder();
                Enumeration enu = request.getParameterNames();

                while (true) {
                    while (enu.hasMoreElements()) {
                        String name = (String) enu.nextElement();
                        String[] paramValues = request.getParameterValues(name);
                        if (paramValues.length == 0) {
                            params.append(name).append("=").append(request.getParameter(name)).append("&");
                        } else {
                            for (String value : paramValues) {
                                params.append(name).append("=").append(value).append("&");
                            }
                        }
                    }

                    System.out.println("请求参数: " + (!params.toString().equals("") ? params.substring(0, params.length() - 1) : params.toString()));
                    break;
                }
            } else if (method.equalsIgnoreCase("post")) {
//                params = IOUtils.toString(request.getInputStream(), "UTF-8");
//                LogUtils.info("请求参数: " + params);
                System.out.println("===================> post");
            }
//            else if (method.equalsIgnoreCase("put")) {
//                params = IOUtils.toString(request.getInputStream(), "UTF-8");
//                LogUtils.info("请求参数: " + params);
//            } else if (method.equalsIgnoreCase("delete")) {
//            }
        }
    }

    @AfterReturning(returning = "obj", pointcut = "opsLog()")
    public void doAfter(JoinPoint joinPoint, Object obj) {
        System.out.println("===================> after: " + obj.toString());
    }
}
