package com.example.aerospike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringAerospikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAerospikeApplication.class, args);
	}

}
