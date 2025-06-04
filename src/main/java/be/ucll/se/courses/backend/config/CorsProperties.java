package be.ucll.se.courses.backend.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.List;

@ConfigurationProperties(prefix = "cors")
public record CorsProperties(
        @DefaultValue("https://projectv2-frontend-gqfvcxacgnhxazf5.westeurope-01.azurewebsites.net") List<String> allowedOrigins) {
}
