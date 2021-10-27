package cn.com.yangshj.eureka.listener;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstanceCancelListener implements ApplicationListener<EurekaInstanceCanceledEvent> {

    @Override
    public void onApplicationEvent(EurekaInstanceCanceledEvent eurekaInstanceCanceledEvent) {
        System.out.println(eurekaInstanceCanceledEvent.getAppName() + "服务挂了");
    }
}
