package org.example.kafka.example.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

  @KafkaListener(topics = "KAFKA_TEST",
  groupId = "groupId")
  void listener(String data) {
    System.out.println("Listen datas: " + data);
  }
}
