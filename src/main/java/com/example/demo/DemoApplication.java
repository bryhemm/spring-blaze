package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blazebit.persistence.spring.data.repository.config.EnableBlazeRepositories;

@SpringBootApplication
@EnableBlazeRepositories
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
