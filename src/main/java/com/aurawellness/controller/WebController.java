package com.aurawellness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "index"; // Renderiza la página principal (index.html)
    }

    @GetMapping("/catalogo")
    public String catalogo() {
        return "catalogo"; // Renderiza la vista del catálogo de salud
    }

    @GetMapping("/servicios")
    public String servicios() {
        return "servicios"; // Renderiza la vista de los servicios de estética
    }
}