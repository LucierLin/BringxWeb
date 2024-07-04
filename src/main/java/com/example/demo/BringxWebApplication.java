package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication(scanBasePackages = "com.example.demo")
public class BringxWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BringxWebApplication.class, args);
	}

}
