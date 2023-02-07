package com.drcode.drcode.forall;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/public")

public class CatalogController {

    @GetMapping("/demo")
    public ResponseEntity<String> sayHello(){

        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
