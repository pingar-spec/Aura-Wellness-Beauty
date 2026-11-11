package com.aurawellness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "index"; // Carga index.html
    }

    @GetMapping("/bienestar")
    public String bienestar() {
        return "bienestar"; // Carga bienestar.html
    }

    @GetMapping("/estetica")
    public String estetica() {
        return "estetica"; // Carga estetica.html
    }
}