package com.hamitmizrak.springmvc;

import com.hamitmizrak.dto.RegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    // http://localhost:2222/mvc/api/redirect2
    @GetMapping("/redirect2") //URL
    public String getThymeleaf2(Model model){
        model.addAttribute("key_thymeleaf2","Backendtten geldi");
        return "thymeleaf2"; //HTML SAYFASI
    }

    // http://localhost:2222/mvc/api/redirect3
    @GetMapping("/redirect3") //URL
    public String getThymeleaf3(Model model){
        RegisterDto registerDto=new RegisterDto(1L,"name","surname");
        model.addAttribute("key_thymeleaf3",registerDto);
        return "thymeleaf3"; //HTML SAYFASI
    }
}
