package com.portfolio.Deto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetoApplication.class, args);
	}
        
        
        @Bean
public WebMvcConfigurer corsConfigurer() {
  return new WebMvcConfigurer() {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
      registry.addMapping("/**")
        .allowedOrigins("https://frontenddeto.web.app", "http://localhost:4200")
        .allowedMethods("*");
    }
  };
}

}
