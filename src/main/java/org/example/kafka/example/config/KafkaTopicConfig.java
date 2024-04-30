package org.example.kafka.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.example.kafka.example.config.constants.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

  @Bean
  public NewTopic kafkaTopic() {
    return TopicBuilder
        .name(Topic.KAFKA_TEST.name())
        .build();
  }
}
