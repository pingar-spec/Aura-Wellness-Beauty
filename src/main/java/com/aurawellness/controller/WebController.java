package com.aurawellness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
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

    @GetMapping("/producto/detalle")
    public String detalleProducto(@RequestParam("nombre") String nombre, @RequestParam("precio") String precio, Model model) {
        model.addAttribute("nombreProducto", nombre);
        model.addAttribute("precioProducto", precio);
        return "detalle-producto";
    }
}