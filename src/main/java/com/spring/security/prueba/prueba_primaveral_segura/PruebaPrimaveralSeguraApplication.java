package com.spring.security.prueba.prueba_primaveral_segura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PruebaPrimaveralSeguraApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaPrimaveralSeguraApplication.class, args);
	}

}
