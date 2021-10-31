package com.kafka.practice.kafkaSampleProject.Poducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.practice.kafkaSampleProject.model.Employee;

@RestController
@RequestMapping("/kafka")
public class Producer {

	@Autowired
	KafkaTemplate<String, Employee> kafkaTemplate;

	private String topicName = "TOPIC";

	@GetMapping("/add/{name}")
	public String addMessageToKafka(@PathVariable("name") String name) {
		try {
			kafkaTemplate.send(topicName, new Employee(name,"Inditex","Spain"));
			return "Success";
		} catch (Exception e) {
			System.out.println(e);
			return "Failed";
		}

	}

}
