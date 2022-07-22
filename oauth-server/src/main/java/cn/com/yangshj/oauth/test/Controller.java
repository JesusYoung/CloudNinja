package cn.com.yangshj.oauth.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/aaa")
public class Controller {


    @GetMapping("/getA")
    public Map<String, Object> getaaa() {
        Map<String, Object> map = new HashMap<>();
        map.put("aaa", 111);
        map.put("bbb", "aaa");
        System.out.println("aaaaaaaaaaaa");
        return map;
    }

    @GetMapping("/getB")
    public Map<String, Object> getbbb() {
        Map<String, Object> map = new HashMap<>();
        map.put("aaa", 222);
        map.put("bbb", "bbb");
        System.out.println("bbbbbbbbbbbb");
        return map;
    }
}
