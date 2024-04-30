package com.example.healthcheckapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/heath-check")
public class HealthCheckController {

        @GetMapping
        public String healthCheck() {
            return "Health check is OK";
        }
}
