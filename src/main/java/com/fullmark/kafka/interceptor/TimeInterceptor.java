package com.fullmark.kafka.interceptor;

import org.apache.kafka.clients.producer.ProducerInterceptor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Map;

/**
 * 增加时间戳拦截器
 * @author fanghuanbiao
 */
public class TimeInterceptor implements ProducerInterceptor<String, String> {

    /**
     * 获取配置信息和初始化数据时调用。
     * @param map
     */
    @Override
    public void configure(Map<String, ?> map) {

    }

    /**
     *该方法封装进KafkaProducer.send方法中，即它运行在用户主线程中。Producer确保在消息被序列化以及计算分区前调用该方法。
     * 用户可以在该方法中对消息做任何操作，但最好保证不要修改消息所属的topic和分区，否则会影响目标分区的计算
     * @param producerRecord
     * @return
     */
    @Override
    public ProducerRecord<String, String> onSend(ProducerRecord<String, String> producerRecord) {
        // 创建一个新的record，把时间戳写入消息体的最前部
        return new ProducerRecord(producerRecord.topic(), producerRecord.partition(), producerRecord.timestamp(), producerRecord.key(),
                System.currentTimeMillis() + "," + producerRecord.value().toString());

    }

    /**
     * 该方法会在消息被应答或消息发送失败时调用，并且通常都是在producer回调逻辑触发之前。
     * onAcknowledgement运行在producer的IO线程中，因此不要在该方法中放入很重的逻辑，否则会拖慢producer的消息发送效率
     * @param recordMetadata
     * @param e
     */
    @Override
    public void onAcknowledgement(RecordMetadata recordMetadata, Exception e) {

    }

    /**
     * 关闭interceptor，主要用于执行一些资源清理工作
     */
    @Override
    public void close() {

    }

}
