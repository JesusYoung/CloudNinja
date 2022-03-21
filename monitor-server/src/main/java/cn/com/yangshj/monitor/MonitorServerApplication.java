package cn.com.yangshj.monitor;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableEurekaClient
@SpringBootApplication
public class MonitorServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorServerApplication.class, args);
    }

//    // prometheus + grafana + springboot2监控集成配置
//    @Bean
//    MeterRegistryCustomizer<MeterRegistry> configurer(
//            @Value("${spring.application.name}") String applicationName) {
//                return (registry) -> registry.config().commonTags("application", applicationName);
//    }
//
//
//    @RequestMapping(value = "/hello")
//    public @ResponseBody String hello() {
//        return "hello world";
//    }
}
