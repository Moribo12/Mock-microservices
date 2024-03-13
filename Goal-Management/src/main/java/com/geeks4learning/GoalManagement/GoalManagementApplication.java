package com.geeks4learning.GoalManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GoalManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoalManagementApplication.class, args);
	}

}
