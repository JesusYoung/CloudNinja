package cn.com.yangshj.eureka.listener;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstanceRenewListener implements ApplicationListener<EurekaInstanceRenewedEvent> {

    @Override
    public void onApplicationEvent(EurekaInstanceRenewedEvent eurekaInstanceRenewedEvent) {
        System.out.println("心跳检测服务：" + eurekaInstanceRenewedEvent.getInstanceInfo().getAppName());
    }
}
