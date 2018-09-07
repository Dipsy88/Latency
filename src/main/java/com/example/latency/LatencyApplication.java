package com.example.latency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LatencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LatencyApplication.class, args);
	}
}
