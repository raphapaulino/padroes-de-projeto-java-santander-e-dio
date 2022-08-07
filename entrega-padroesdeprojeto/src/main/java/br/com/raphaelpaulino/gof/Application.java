package br.com.raphaelpaulino.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * O seguinte módulo foi adicionado manualmente:
 * - OpenApi/Swagger
 *
 * @see <a href="https://springdoc.org/#getting-started">springdoc.org</a>
 *
 * @author Raphael Paulino <github>raphapaulino</github>
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
