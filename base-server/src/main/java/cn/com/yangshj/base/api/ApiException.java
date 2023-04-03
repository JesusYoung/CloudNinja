package cn.com.yangshj.base.api;

import java.util.Optional;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.validation.BindingResult;

/**
 * 自动以API异常
 *
 * @author yangshj
 * @since 2023/3/24 14:51
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

    /**
     * 构建异常
     */
    public ApiException(BindingResult bindingResult) {
        super(Optional.ofNullable(bindingResult.getFieldError())
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .orElse("参数错误"));
        this.errorCode = ResultCode.VALIDATE_FAILED;
    }
}
