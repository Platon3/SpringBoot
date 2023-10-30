package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class holaMundo {

    @GetMapping("/hola")
    public String hola()
    {
        return "Esto es un mensaje por consola";
    }
    @PostMapping("/regreso")
    public String resultado (@RequestBody String  cadena)
    {
        return cadena;
    }
}
