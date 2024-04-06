package fr.springbootapachekafka.apache_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {

    @Bean
    public NewTopic myTopic(){
        return TopicBuilder.name("kafka-topic1").build();

    }
}
