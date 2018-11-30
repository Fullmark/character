package com.fullmark.kafka.partitioner;

import kafka.producer.Partitioner;

/**
 * 需求：将所有数据存储到topic的第0号分区上
 * 定义一个类实现Partitioner接口，重写里面的方法（过时API）
 * @author fanghuanbiao
 */
public class OldCustomPartitioner implements Partitioner {

    public OldCustomPartitioner() {
        super();
    }
    @Override
    public int partition(Object key, int numPartitions) {
        //控制分区
        return 0;
    }
}
