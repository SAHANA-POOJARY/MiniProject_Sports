package com.lulu.MiniProjectSportsProduct;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MiniProjectSportsProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectSportsProductApplication.class, args);
	}

}
