package com.example.latency.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.latency.model.CloudProvider;
import com.example.latency.repository.CloudProviderRepository;


@RestController
@RequestMapping("/api")
public class CloudProviderController {

	@Autowired
	CloudProviderRepository cloudProviderRespository;
	
	// Get All Notes
	@GetMapping("/cloudprovider")
	public List<CloudProvider> getAllCloudProvider() {
	    return cloudProviderRespository.findAll();
	}
	
	//Create a new CloudProvider
	@PostMapping("/cloudprovider")
	public CloudProvider createNote(@Valid @RequestBody CloudProvider cloudProvider) {
	    return cloudProviderRespository.save(cloudProvider);
	}
	
	
	
}
