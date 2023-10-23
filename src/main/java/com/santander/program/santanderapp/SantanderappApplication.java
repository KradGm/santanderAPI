package com.santander.program.santanderapp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Essa é a URL padrão do servidor")})
@SpringBootApplication
public class SantanderappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderappApplication.class, args);
	}

}
