package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudGateWayAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGateWayAppApplication.class, args);
	}

}
