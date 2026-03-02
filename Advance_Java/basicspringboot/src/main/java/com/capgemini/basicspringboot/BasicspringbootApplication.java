package com.capgemini.basicspringboot;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BasicspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicspringbootApplication.class, args);
	}

	@Bean
	public OpenAPI getOpenAPI(){
		return new OpenAPI();
	}

}
