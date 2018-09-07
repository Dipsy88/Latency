package com.example.latency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.latency.model.CloudProvider;



@Repository
public interface CloudProviderRepository extends JpaRepository<CloudProvider, Integer>{

	
	
}