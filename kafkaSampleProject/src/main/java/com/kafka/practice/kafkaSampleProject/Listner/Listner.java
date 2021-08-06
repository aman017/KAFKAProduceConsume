package com.kafka.practice.kafkaSampleProject.Listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Listner {
	
	@KafkaListener(topics = "TOPIC_INDITEX_JSON",groupId = "group_Id")
	public void listnerKafka(String msg) {
		
		System.out.println(msg);
		
	}
	

}
