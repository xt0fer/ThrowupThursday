package com.example.throwupthursday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//

@SpringBootApplication
@EnableJpaRepositories
public class ThrowupThursdayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThrowupThursdayApplication.class, args);
	}
}
