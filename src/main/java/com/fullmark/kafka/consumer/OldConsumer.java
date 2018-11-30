package com.fullmark.kafka.consumer;

import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 创建消费者（过时API）
 * @author fanghuanbiao
 */
public class OldConsumer {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.put("zookeeper.connect", "localhost:2181");
        properties.put("group.id", "g1");
        properties.put("zookeeper.session.timeout.ms", "500");
        properties.put("zookeeper.sync.time.ms", "250");
        properties.put("auto.commit.interval.ms", "1000");

        // 创建消费者连接器
        ConsumerConnector consumer = Consumer.createJavaConsumerConnector(new ConsumerConfig(properties));

        HashMap<String, Integer> topicCount = new HashMap<>();
        topicCount.put("test1", 1);

        Map<String, List<KafkaStream<byte[], byte[]>>> consumerMap = consumer.createMessageStreams(topicCount);

        KafkaStream<byte[], byte[]> stream = consumerMap.get("test1").get(0);

        ConsumerIterator<byte[], byte[]> it = stream.iterator();

        while (it.hasNext()) {
            System.out.println(new String(it.next().message()));
        }
    }
}
