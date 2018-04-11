package com.capg.accservices.kafka.configurations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSender {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(KafkaSender.class);

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  @Value("${kafka.topic}")
  String topic;
  
  public void send(String payload) {
    LOGGER.info("sending payload='{}' to topic='{}'", payload, topic);
    kafkaTemplate.send(topic, payload);
  }
}