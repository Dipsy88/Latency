package com.example.latency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.latency.controller.LatencyController;

@SpringBootApplication
@EnableJpaAuditing
public class LatencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LatencyApplication.class, args);
	}

	// to run from the same app
//	@Autowired
//	private CloudProviderRepository cloudProviderRepository;

	@Autowired
	LatencyController latencyController;

	// do something after the spring boot starts
	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
//		Optional<CloudProvider> cloudProvider = cloudProviderRepository.findById((long) 1);
//		if (cloudProvider.isPresent()) {
//			CloudProvider cloudProvider2 = cloudProvider.get();
//			System.out.println(cloudProvider2.getName());
//		}

		latencyController.run();
	}

}
