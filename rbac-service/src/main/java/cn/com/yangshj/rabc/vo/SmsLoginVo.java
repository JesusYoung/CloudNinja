package cn.com.yangshj.rabc.vo;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 短信验证码登录入参
 *
 * @author yangshj
 * @since 2023/4/20 16:19
 */
@Data
@ToString
public class SmsLoginVo {

    @NotBlank(message = "手机号码不能为空")
    @ApiModelProperty("手机号码")
    private String phoneNumber;

    @NotBlank(message = "验证码不能为空")
    @ApiModelProperty("验证码")
    private String sms;
}
