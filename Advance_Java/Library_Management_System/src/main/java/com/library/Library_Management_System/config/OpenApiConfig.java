package com.library.Library_Management_System.config;
import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.*;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI libraryApi(){

        return new OpenAPI()
                .info(new Info()
                        .title("Library Management API")
                        .description("Spring Boot Library Management System")
                        .version("1.0"));
    }
}