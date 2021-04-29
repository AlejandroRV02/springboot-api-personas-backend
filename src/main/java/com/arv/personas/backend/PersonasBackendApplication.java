package com.arv.personas.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sun.xml.bind.annotation.OverrideAnnotationOf;

@SpringBootApplication
public class PersonasBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonasBackendApplication.class, args);
	}

	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*")
				.allowedHeaders("*");
			}
		};
	}
}
