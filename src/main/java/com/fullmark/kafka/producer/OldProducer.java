package com.fullmark.kafka.producer;


import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.util.Properties;

/**
 * 创建生产者（过时API）
 * @author fanghuanbiao
 */
public class OldProducer {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("metadata.broker.list", "localhost:9092");
        properties.put("request.required.acks", "1");
        properties.put("serializer.class", "kafka.serializer.StringEncoder");

        Producer<String, String> producer = new Producer<String,String>(new ProducerConfig(properties));

        KeyedMessage<String, String> message = new KeyedMessage<String, String>("test1", "hello world");
        producer.send(message);
    }
}
