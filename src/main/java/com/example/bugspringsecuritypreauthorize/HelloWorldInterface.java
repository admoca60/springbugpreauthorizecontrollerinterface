package com.example.bugspringsecuritypreauthorize;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface HelloWorldInterface {
    @GetMapping("/api/hello/{name}")
    default ResponseEntity<String> sayHello(@PathVariable final String name) {
        return ResponseEntity.ok("Hello " + name);
    }
}
