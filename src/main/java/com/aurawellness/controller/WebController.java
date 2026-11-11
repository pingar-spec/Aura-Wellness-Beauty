package com.aurawellness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/bienestar")
    public String bienestar() {
        return "bienestar";
    }

    @GetMapping("/estetica")
    public String estetica() {
        return "estetica";
    }
}