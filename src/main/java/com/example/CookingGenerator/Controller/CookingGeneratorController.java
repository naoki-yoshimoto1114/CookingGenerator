package com.example.CookingGenerator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CookingGeneratorController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("choose/category")
    public String category() {
        return "category";
    }

    @GetMapping("choose/cook")
    public String cook() {
        return "cook";
    }

    @GetMapping("choose/result")
    public String result() {
        return "result";
    }
}
