package com.nems.stream.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
public class NemsStreamingConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NemsStreamingConsumerApplication.class, args);
	}
}
