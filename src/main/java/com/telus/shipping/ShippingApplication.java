package com.telus.shipping;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The shipping application.
 *
 * @author John Dexter Reyes
 */
@SpringBootApplication
public class ShippingApplication {

	/**
	 * The main method for running the application.
	 * @param args the application arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ShippingApplication.class, args);
	}

	@Bean
	public OpenAPI openApi() {
		return new OpenAPI().info(new Info().title("shipping").description("Shipping service").version("0.0.1-SNAPSHOT")
				.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}

}
