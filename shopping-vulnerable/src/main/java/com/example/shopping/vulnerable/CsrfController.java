package com.example.shopping.vulnerable;

import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CsrfController {

    @GetMapping("/csrf-token")
    public String getCsrfToken(CsrfToken csrfToken) {
        return csrfToken.getToken();
    }
}
