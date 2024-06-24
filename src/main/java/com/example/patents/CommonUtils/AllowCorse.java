package com.example.patents.CommonUtils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class AllowCorse implements WebMvcConfigurer {
    @Value("${web.cors.allowed-origins}")
    String corsAllowedOrigins;


    @Value("${web.cors.max-age}")
    Integer corsMaxAge;
    @Bean
    public WebMvcConfigurer CorsConfiguration() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOriginPatterns("*")
                        .exposedHeaders("Authorization")
                        .allowedMethods("HEAD", "OPTIONS", "GET", "POST", "PUT", "PATCH", "DELETE")
                        .maxAge(corsMaxAge)
                        .allowCredentials(true);
            }
        };
    }

}