package com.fullmark.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 使用@KafkaListener注解,可以指定:主题,分区,消费组
 * @author fanghuanbiao
 */
@Component
public class KafkaConsumer {

    @KafkaListener(id="test",topics = {"test1"})
    public void listen(ConsumerRecord<?,String> record) {
        String value = record.value();
        System.out.println(value);
        System.out.println(record);
    }
}
