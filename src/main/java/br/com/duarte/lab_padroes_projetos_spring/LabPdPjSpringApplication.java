package br.com.duarte.lab_padroes_projetos_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* 	Projeto Spring Boot gerado via Spring Initializer.
*   Abaixo da lista de dependencias instaladas:
*   - Spring Data JPA
* 	- Spring Web
*   - H2 Database
*   - OpenFeign
*
* 	@author: Rodrigo Duarte
* */

@EnableFeignClients
@SpringBootApplication
public class LabPdPjSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPdPjSpringApplication.class, args);
	}
}
