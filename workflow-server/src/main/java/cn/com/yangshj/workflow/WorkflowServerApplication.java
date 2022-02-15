package cn.com.yangshj.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;

@Controller
@EnableEurekaClient
@SpringBootApplication
public class WorkflowServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkflowServerApplication.class, args);
    }
}
