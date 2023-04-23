package com.techacademyd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/")
    public String index() {
        return "Hello SpringBoot!";
    }
}