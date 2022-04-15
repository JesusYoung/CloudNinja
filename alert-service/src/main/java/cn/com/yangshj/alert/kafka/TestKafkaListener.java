package cn.com.yangshj.alert.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Create by yangshijie on 4/15/22
 */
public class TestKafkaListener {


    @KafkaListener(topics = "topic-demo")
    public void  topic_test(ConsumerRecord<?, ?> record) {

    }
}
