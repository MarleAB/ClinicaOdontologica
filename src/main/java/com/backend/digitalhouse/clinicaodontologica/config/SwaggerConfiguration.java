package com.backend.digitalhouse.clinicaodontologica.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfiguration {

   @Bean
   public OpenAPI clinicaOdontologicaOpenAPI() {
       return new OpenAPI().info(apiInfo());
   }
   private Info apiInfo() {
       return new Info()
               .title("Clinica Odontológica API")
               .description("Clinica Odontológica sample application")
               .termsOfService("http://swagger.io/terms/")
               .version("v0.0.1")
               .license(license())
               .contact(contact());
   }
   private License license() {
       return new License()
               .name("MIT Licence")
               .url("https://opensource.org/licenses/mit-license.php");
   }
   private Contact contact() {
       return new Contact()
               .name("MAB")
               .url("https://digitalhouse.com")
               .email("mab@example.com");
   }
}
