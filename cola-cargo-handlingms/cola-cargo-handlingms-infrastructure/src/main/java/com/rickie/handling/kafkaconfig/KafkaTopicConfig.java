package com.rickie.handling.kafkaconfig;

import com.rickie.handling.dto.event.DomainEventConstant;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName KafkaTopicConfig.java
 * @Description TODO
 * @createTime 2021年07月15日 09:12:00
 */
@Configuration
public class KafkaTopicConfig {
    @Value(value = "${kafka.bootstrapAddress}")
    private String bootstrapAddress;

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        return new KafkaAdmin(configs);
    }

    @Bean
    public NewTopic cargoHandledEventTopic() {
        return new NewTopic(DomainEventConstant.CARGO_HANDLED_EVENT_TOPIC, 2, (short) 1);
    }
}
