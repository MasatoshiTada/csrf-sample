package com.example.evil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EvilController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
