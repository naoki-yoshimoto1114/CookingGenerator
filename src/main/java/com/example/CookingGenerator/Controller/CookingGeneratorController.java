package com.example.CookingGenerator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookingGeneratorController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("choose/ingredients")
    public String ingredients() {
        return "ingredients";
    }

    @RequestMapping("choose/category")
    public String category() {
        return "category";
    }

    @RequestMapping("choose/cook")
    public String cook() {
        return "cook";
    }

    @GetMapping("choose/result")
    public String result() {
        return "result";
    }
}

