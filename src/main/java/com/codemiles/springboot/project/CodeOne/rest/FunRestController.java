package com.codemiles.springboot.project.CodeOne.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${first.name}")
    private String firstName;

    @Value("${last.name}")
    private String lastName;
    @GetMapping("/")
    public String sayHello(){

        return "Hello "+firstName+" "+lastName+" .Have a Nice Day";
    }

}
