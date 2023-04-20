package cn.com.yangshj.oauth.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 授权服务常量
 *
 * @author yangshj
 * @since 2023/3/24 13:50
 */
public class OAuthConstant {

    private OAuthConstant() {}

    public static Map<String, String> smsCode = new HashMap<>();

    static {
        smsCode.put("15333459987", "339900");
        smsCode.put("15333459986", "887766");
    }

    /**
     * 存储 JWT 密钥对的文件路径
     */
    public static final String JWT_KEY_STORE_PATH = "cloud_ninja.jks";
    /**
     * JWT 密钥库别名
     */
    public static final String JWT_KEY_STORE_ALIAS = "cloud_ninja";
    /**
     * JWT 密钥密码
     */
    public static final String JWT_KEY_STORE_PASS = "cloud_ninja";



    // ====================== 认证类型路径 =========================
    /**
     * 认证路径：短信验证码
     */
    public static final String CUSTOM_AUTH_TYPE_PATH_SMS = "/oauth/sms";
    /**
     * 认证路径：邮箱验证码
     */
    public static final String CUSTOM_AUTH_TYPE_PATH_EMAIL = "/oauth/email";


    // ====================== 认证类型 =========================
    /**
     * 认证类型：短信验证码
     */
    public static final String CUSTOM_AUTH_TYPE_SMS_CODE = "sms_code";
    public static final String CUSTOM_AUTH_TYPE_EMAIL_CODE = "email_code";

    public static final String AUTH_PARAMETER_KEY_SMS = "phoneNumber";
    public static final String AUTH_PARAMETER_VALUE_SMS = "sms";
    public static final String AUTH_PARAMETER_KEY_EMAIL = "email";
    public static final String AUTH_PARAMETER_VALUE_EMAIL = "code";
}
