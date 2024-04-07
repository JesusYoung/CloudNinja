package cn.com.yangshj.rabc.exception;

import javax.validation.ConstraintViolationException;

import cn.com.yangshj.base.api.ResultCode;
import cn.com.yangshj.base.entity.CommonResult;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 自定义异常捕获
 *
 * @author Jorge Young
 * @since 2024/4/7 14:17
 */
@RestControllerAdvice
public class CommonExceptionHandler {


    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CommonResult<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        BindingResult bindingResult = exception.getBindingResult();
        StringBuilder sb = new StringBuilder("校验失败:");
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            sb.append(fieldError.getField()).append(":").append(fieldError.getDefaultMessage()).append(", ");
        }
        String msg = sb.toString();
        return CommonResult.failed(msg);
    }

    @ExceptionHandler({ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CommonResult<?> handleConstraintViolationException(ConstraintViolationException ex) {
        return CommonResult.failed(ResultCode.FAILED, ex.getMessage());
    }
}
