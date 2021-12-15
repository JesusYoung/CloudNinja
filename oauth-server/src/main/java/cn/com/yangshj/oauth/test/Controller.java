package cn.com.yangshj.oauth.test;

import com.oracle.tools.packager.Log;
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
        map.put("bbb", "asd");

        Log.info("aaa: 111-------------");
        System.out.println("aasdsdsdsds");
        return map;
    }
}
