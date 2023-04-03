package cn.com.yangshj.oauth.controller;

import javax.annotation.Resource;
import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 获取公钥Controller
 *
 * @author yangshj
 * @since 2023/3/23 17:14
 */
@Controller
@RequestMapping
public class PublicKeyController {

//    @Resource
//    private KeyPair keyPair;
//
//    @GetMapping("/rsa/publicKey")
//    @ResponseBody
//    public Map<String, Object> getPublicKey() {
//        RSAPublicKey publicKey = (RSAPublicKey) this.keyPair.getPublic();
//        RSAKey key = new RSAKey.Builder(publicKey).build();
//        return new JWKSet(key).toJSONObject();
//    }
}
