package com.kafka.consumer.example.kafkaConsumer.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaConsumer {

	@KafkaListener(
			topics="Ajinkya",
			groupId="groupId"
			)
	 void listenData(String data){
		System.out.println("Got the data "+ data + " this is fun");
	}
}
