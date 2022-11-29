package cn.com.yangshj.rabc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 *
 * @author yangshj
 * @since 2022/11/29 20:44
 */
@EnableEurekaClient
@SpringBootApplication
public class RbacServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RbacServiceApplication.class, args);
    }
}
