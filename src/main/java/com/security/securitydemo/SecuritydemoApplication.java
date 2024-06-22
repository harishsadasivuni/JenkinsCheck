package com.security.securitydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan("com")
@EntityScan("com")
@EnableJpaRepositories("com.security.dao")
@SpringBootApplication
public class SecuritydemoApplication {

	public static void main(String[] args) {
		System.out.println("Harish Comment: Application is Running!!");
		System.out.println("Aparna is sleeping!!");
		SpringApplication.run(SecuritydemoApplication.class, args);

	}

}
