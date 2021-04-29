package com.example.bugspringsecuritypreauthorize;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController implements HelloWorldInterface {


    @GetMapping("/api/goodbye/{name}")
//    @PreAuthorize("hasRole('user')")
    @PreAuthorize("true")
    public ResponseEntity<String> sayGoodbye(@PathVariable final String name) {
        return ResponseEntity.ok("Goodbye " + name);
    }
}
