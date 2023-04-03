package cn.com.yangshj.base.api;

/**
 * 封装API的错误码
 *
 * @author yangshj
 * @since 2023/3/24 14:46
 */
public interface IErrorCode {

    long getCode();

    String getMessage();
}
