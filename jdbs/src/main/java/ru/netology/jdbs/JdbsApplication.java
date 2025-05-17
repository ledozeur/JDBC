package ru.netology.jdbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class JdbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbsApplication.class, args);
	}

}

