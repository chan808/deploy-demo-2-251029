package com.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return """
                <h1>!!!Welcome to the Real Home Page!!!</h1>
                <p>This is a simple Spring Boot application.</p>
                """;
    }
}
