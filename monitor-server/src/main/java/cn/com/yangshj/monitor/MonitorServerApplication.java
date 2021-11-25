package cn.com.yangshj.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MonitorServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorServerApplication.class, args);
    }

}
