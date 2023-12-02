package com.marina.nkmarina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class CursomcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
		
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
                .allowedOriginPatterns("*") // Permitir solicitações de qualquer origem
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos HTTP permitidos
                .allowedHeaders("*") // Permitir todos os cabeçalhos
                .allowCredentials(true); // Permitir credenciais (por exemplo, cookies)
			}
		};
	}

}
