package cn.com.yangshj.monitor.webservice.test;

import lombok.Data;
import lombok.ToString;

/**
 * Create by yangshijie on 3/31/22
 */
@Data
@ToString
public class LoginResult {
    private UserLoginInfo UserLoginInfo;


    @Data
    @ToString
    public class UserLoginInfo {
        private String isSuccess;
        private String token;
        private String dateTime;
        private String userId;
    }
}
