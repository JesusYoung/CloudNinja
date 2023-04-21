package cn.com.yangshj.oauth.utils;

import java.util.Random;

import cn.com.yangshj.base.api.ApiException;
import org.springframework.util.ObjectUtils;

/**
 * 验证码工具类
 *
 * @author yangshj
 * @since 2023/4/21 13:56
 */
public class VerificationCodeUtil {

    private VerificationCodeUtil() {}

    /**
     * 字符串验证码库
     * 去掉了 0、1、i、o等易混淆词
     */
    private static final char[] VERIFY_HEX_CHARS = new char[] {'2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C',
            'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final int DEFAULT_VERIFY_SIZE = 6;
    private static final int MIN_VERIFY_SIZE = 4;



    private static final Random RANDOM = new Random();

    public static String generateNumberVerifyCode() {
        return generateNumberVerifyCode(DEFAULT_VERIFY_SIZE);
    }

    public static String generateNumberVerifyCode(int verifySize) {
        if (verifySize < MIN_VERIFY_SIZE) {
            throw new ApiException("验证码位数不能小于4位");
        }
        int n = verifySize - 1;
        int maxScope = (int) (Math.pow(10, n) * 9);
        int minScope = (int) Math.pow(10, n);
        int numberCode = minScope + RANDOM.nextInt(maxScope);
        return String.valueOf(numberCode);
    }

    public static String generateStrVerifyCode() {
        return generateStrVerifyCode(DEFAULT_VERIFY_SIZE);
    }

    public static String generateStrVerifyCode(int verifySize) {
        return generateStrVerifyCode(verifySize, VERIFY_HEX_CHARS);
    }

    public static String generateStrVerifyCode(int verifySize, char[] charSource) {
        if (verifySize < MIN_VERIFY_SIZE) {
            throw new ApiException("验证码位数不能小于4位");
        }
        if (ObjectUtils.isEmpty(charSource)) {
            charSource = VERIFY_HEX_CHARS;
        }
        int hexCharsLen = charSource.length;
        StringBuilder verifyCode = new StringBuilder(verifySize);
        for (int i = 0; i < verifySize; i++) {
            verifyCode.append(charSource[RANDOM.nextInt(hexCharsLen - 1)]);
        }
        return verifyCode.toString();
    }
}
