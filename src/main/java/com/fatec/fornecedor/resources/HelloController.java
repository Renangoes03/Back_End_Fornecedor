package com.fatec.fornecedor.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("Hello")
    public String Hello() {
        return "Meu primeiro EndPoint em Java";
    }

}




