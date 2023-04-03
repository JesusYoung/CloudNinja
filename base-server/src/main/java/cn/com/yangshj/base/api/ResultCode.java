package cn.com.yangshj.base.api;

import lombok.Getter;

/**
 * @author yangshijie
 * @since 2023/3/24 14:47
 */
@Getter
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "会话已经过期，请重新登录"),
    FORBIDDEN(403, "没有相关权限，请联系管理员"),
    ;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    private final long code;
    private final String message;
}
