package com.example.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyMicroserviceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MyMicroserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("Hello ---> " + new Date());
	}

}
