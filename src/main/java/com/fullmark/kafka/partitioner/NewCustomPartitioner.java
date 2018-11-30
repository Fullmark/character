package com.fullmark.kafka.partitioner;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

import java.util.Map;

/**
 * 需求：将所有数据存储到topic的第0号分区上
 * 定义一个类实现Partitioner接口，重写里面的方法（新API）
 * @author fanghuanbiao
 */
public class NewCustomPartitioner implements Partitioner {

    @Override
    public void configure(Map<String, ?> map) {

    }

    @Override
    public int partition(String s, Object o, byte[] bytes, Object o1, byte[] bytes1, Cluster cluster) {
        // 控制分区
        return 0;
    }

    @Override
    public void close() {

    }


}
