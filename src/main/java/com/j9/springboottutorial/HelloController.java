package com.j9.springboottutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping ("/")
    public String index (){
        return "Eat Me!";
    }
    @RequestMapping ("/Drink")
    public String index2 (){
        return "Drink Me!";
    }
}
