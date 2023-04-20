package cn.com.yangshj.base.exception;


import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;

import cn.com.yangshj.base.api.ApiException;
import cn.com.yangshj.base.api.ResultCode;
import cn.com.yangshj.base.entity.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

/**
 * 全局异常处理
 *
 * @author yangshj
 * @since 2023/4/20 16:31
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    // 业务异常 200
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(value = ApiException.class)
    public CommonResult<Object> handle(ApiException e) {
        LOGGER.error(e.getMessage(), e);
        if (e.getErrorCode() != null) {
            return CommonResult.failed(e.getErrorCode());
        }
        return CommonResult.failed(e.getMessage());
    }

    // 服务调用异常 200
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(value = HttpClientErrorException.class)
    public CommonResult<Object> handle(HttpClientErrorException e) {
        LOGGER.error(e.getMessage(), e);
        return CommonResult.failed(ResultCode.FAILED, e.getMessage());
    }

    // 权限错误 403
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(value = AuthenticationException.class)
    public CommonResult<?> handleOauth2(AuthenticationException e) {
        LOGGER.error(e.getMessage(), e);
        return CommonResult.failed(ResultCode.UNAUTHORIZED, e.getMessage());
    }

    // 参数校验异常 200
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public CommonResult<Object> handleValidException(MethodArgumentNotValidException e) {
        LOGGER.error(e.getMessage(), e);
        BindingResult bindingResult = e.getBindingResult();
        StringBuilder message = new StringBuilder();
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                for (ObjectError objectError : bindingResult.getAllErrors()) {
                    message.append(objectError.getDefaultMessage()).append(" ");
                }
            }
        }
        return CommonResult.validateFailed(message.toString());
    }

    // 参数校验异常 200
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(value = BindException.class)
    public CommonResult<Object> handleValidException(BindException e) {
        LOGGER.error(e.getMessage(), e);
        BindingResult bindingResult = e.getBindingResult();
        StringBuilder message = new StringBuilder();
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                for (ObjectError objectError : bindingResult.getAllErrors()) {
                    message.append(objectError.getDefaultMessage()).append(" ");
                }
            }
        }
        return CommonResult.validateFailed(message.toString());
    }

    // 其他异常 500
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public CommonResult<Object> handleException(HttpServletRequest request, Exception e) {
        LOGGER.error(e.getMessage(), e);
        return new CommonResult<>(getStatus(request).value(), e.getMessage());
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}
