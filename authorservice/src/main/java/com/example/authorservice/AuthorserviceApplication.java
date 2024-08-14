package com.example.authorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication

@EnableDiscoveryClient
public class AuthorserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorserviceApplication.class, args);
	}

}
