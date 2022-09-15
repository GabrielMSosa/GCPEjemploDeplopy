package com.example.egSpringCloud.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @CrossOrigin(origins= "*")
    @GetMapping("/traer")
    public String traer(){
        System.out.println("entramos al get");
        return "entraste al get OK";

    }


}
