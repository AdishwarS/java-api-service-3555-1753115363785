package javaapiservice3555.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "service", "java-api-service-3555");
    }

    @GetMapping("/info")
    public Map<String, Object> info() {
        return Map.of(
            "name", "java-api-service-3555",
            "version", "1.0.0",
            "description", "Create a Java  for user management with PostgreSQL database, JWT authentication, JUnit testing, Docker containerization, and Kubernetes deployment",
            "owner", "backstage-user"
        );
    }
}