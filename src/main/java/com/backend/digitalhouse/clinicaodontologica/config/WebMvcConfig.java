package com.backend.digitalhouse.clinicaodontologica.config;
import org.springframework.web.servlet.config.annotation.*;

@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        registry.addRedirectViewController("/swagger-ui.html", "/swagger-ui/index.html");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
