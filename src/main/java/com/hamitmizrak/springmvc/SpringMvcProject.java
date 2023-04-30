package com.hamitmizrak.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// LOMBOK


// Spring MVC
@Controller
@RequestMapping("/mvc/api")
public class SpringMvcProject {

    // http://localhost:2222/mvc/api/redirect0
    @GetMapping("/redirect0")
    @ResponseBody //htmlsiz için
    public String getThymeleaf0(){
        return "Merhabalar ben Htmlsiz gövdeyim";
    }

    // http://localhost:2222/mvc/api/redirect1
    @GetMapping("/redirect1") //URL
    public String getThymeleaf1(){
        return "thymeleaf1"; //HTML SAYFASI
    }
}
