package com.dimdim.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Deploy efetuado com sucesso no Servidor Tomcat 10";
    }
}
