package com.micro.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.micro.accounts.controller") })
@EnableJpaRepositories("com.micro.accounts.repository")
@EntityScan("com.micro.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
                title = "Accounts microservice REST API Documentation",
                description = "Accounts microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Pranjali Suryavanshi",
                        email = "pranjalisuryavanshi07@gmail.com",
                        url = "https://www.micro.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.micro.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description =  "Accounts microservice REST API Documentation",
                url = "https://www.micro.com/swagger-ui.html"
                )
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
