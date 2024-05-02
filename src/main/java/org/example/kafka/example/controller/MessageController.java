package org.example.kafka.example.controller;

import static org.example.kafka.example.config.constants.Topic.KAFKA_TEST;

import org.example.kafka.example.model.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageController {

  KafkaTemplate<String, String> kafkaTemplate;

  public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  @PostMapping
  public void sendMessage(@RequestBody MessageRequest messageRequest) {
    kafkaTemplate.send(KAFKA_TEST.name(), messageRequest.getMessage());
  }
}
