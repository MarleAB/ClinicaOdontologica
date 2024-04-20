package com.backend.digitalhouse.clinicaodontologica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class ClinicaOdontologicaApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ClinicaOdontologicaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ClinicaOdontologicaApplication.class, args);
		LOGGER.info("ClinicaOdontologicaApplication is now running...");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> enableDefaultServlet() {
		return factory -> factory.setRegisterDefaultServlet(true);
	}

}
