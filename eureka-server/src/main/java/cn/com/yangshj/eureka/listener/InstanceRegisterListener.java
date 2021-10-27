package cn.com.yangshj.eureka.listener;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstanceRegisterListener implements ApplicationListener<EurekaInstanceRegisteredEvent> {

    @Override
    public void onApplicationEvent(EurekaInstanceRegisteredEvent eurekaInstanceRegisteredEvent) {
        System.out.println(eurekaInstanceRegisteredEvent.getInstanceInfo().getAppName() + "服务注册了");
    }
}
