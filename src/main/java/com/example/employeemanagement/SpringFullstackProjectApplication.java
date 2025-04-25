package com.example.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringFullstackProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFullstackProjectApplication.class, args);
	}

}
