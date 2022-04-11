package cn.com.yangshj.monitor.utils;

import lombok.Getter;
import org.springframework.validation.BindingResult;

/**
 * Create by yangshijie on 3/31/22
 */
public class ApiException extends RuntimeException {

    private IErrorCode errorCode;

    public IErrorCode getErrorCode() {
        return errorCode;
    }

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(BindingResult bindingResult) {
        super(bindingResult.getFieldError() != null ?
                bindingResult.getFieldError().getDefaultMessage() : "参数错误");
        this.errorCode = ResultCode.VALIDATE_FAILED;
    }

    public interface IErrorCode {

        long getErrcode();

        String getMessage();
    }

    @Getter
    public enum ResultCode implements IErrorCode {

        SUCCESS(200, "操作成功"),
        FAILED(500, "操作失败"),
        VALIDATE_FAILED(404, "参数检验失败"),
        UNAUTHORIZED(401, "会话已经过期，请重新登录"),
        FORBIDDEN(403, "没有相关权限，请联系管理员"),
        ;

        ResultCode(long errcode, String message) {
            this.errcode = errcode;
            this.message = message;
        }

        private final long errcode;
        private final String message;

    }
}
