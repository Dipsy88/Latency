package com.example.latency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.latency.extras.GetPropertyValues;

@SpringBootApplication
@EnableJpaAuditing
public class LatencyApplication {

	private static GetPropertyValues propValues = new GetPropertyValues();

	public static void main(String[] args) {

		SpringApplication.run(LatencyApplication.class, args);
	}

	public static void simulateDataDatabase() {
		propValues.readValues(); // read the config properties

	}

	// do something after the spring boot starts
	@EventListener(ApplicationReadyEvent.class)
	public static void doSomethingAfterStartup() {
		while (true)
			System.out.println("1");
	}

}
