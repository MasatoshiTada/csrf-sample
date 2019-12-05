package com.example.shopping.vulnerable;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/post")
    public String post(@RequestParam String param, Model model) {
        System.out.println(param);
        model.addAttribute("postParam", param);
        return "result";
    }
}
