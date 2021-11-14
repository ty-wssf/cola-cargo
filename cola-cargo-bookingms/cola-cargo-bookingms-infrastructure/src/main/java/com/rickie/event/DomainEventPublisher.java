package com.rickie.event;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutionException;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName DomainEventPublisher.java
 * @Description TODO
 * @createTime 2021年07月13日 20:17:00
 */
@Component
public class DomainEventPublisher {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    /**
     * 异步方式发送消息，不关注结果
     * @param topic
     * @param msg
     */
    public void publish(String topic, Object msg){
        // publish event
        ProducerRecord<String, Object> pr = new ProducerRecord<>(topic, msg);
        pr.headers().add("type", msg.getClass().getName().getBytes(StandardCharsets.UTF_8));
        kafkaTemplate.send(pr);
    }

    /**
     * 异步方式发送消息，获取结果
     * @param topic
     * @param msg
     */
    public void publishAndResult(String topic, Object msg){
        ProducerRecord<String, Object> pr = new ProducerRecord<>(topic, msg);
        pr.headers().add("type", msg.getClass().getName().getBytes(StandardCharsets.UTF_8));
        ListenableFuture<SendResult<String, Object>> future = kafkaTemplate.send(pr);
        future.addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
            @Override
            public void onFailure(Throwable ex) {
                ex.printStackTrace();
            }

            @Override
            public void onSuccess(SendResult<String, Object> result) {
                System.out.println(result.getProducerRecord());
                System.out.println(result.getRecordMetadata());
            }
        });
    }

    /**
     * 同步发送消息，不建议使用
     * @param topic
     * @param msg
     */
    public void publishSync(String topic, Object msg) {
        ProducerRecord<String, Object> pr = new ProducerRecord<>(topic, msg);
        pr.headers().add("type", msg.getClass().getName().getBytes(StandardCharsets.UTF_8));
        try {
            SendResult<String, Object> sendResult = kafkaTemplate.send(pr).get();
            System.out.println("消息发送成功：" + sendResult.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
