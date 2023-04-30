package com.hamitmizrak.springmvc;

import com.hamitmizrak.dto.RegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// LOMBOK


// Spring MVC
@Controller
@RequestMapping("/mvc/api")
public class SpringMvcProject {

    // http://localhost:2222/mvc/api/redirect0
    @GetMapping("/redirect0")
    @ResponseBody //htmlsiz için
    public String getThymeleaf0() {
        return "Merhabalar ben Htmlsiz gövdeyim";
    }

    // http://localhost:2222/mvc/api/redirect1
    @GetMapping("/redirect1") //URL
    public String getThymeleaf1() {
        return "thymeleaf1"; //HTML SAYFASI
    }

    // http://localhost:2222/mvc/api/redirect2
    @GetMapping("/redirect2") //URL
    public String getThymeleaf2(Model model) {
        model.addAttribute("key_thymeleaf2", "Backendtten geldi");
        return "thymeleaf2"; //HTML SAYFASI
    }

    // http://localhost:2222/mvc/api/redirect3
    @GetMapping("/redirect3") //URL
    public String getThymeleaf3(Model model) {
        RegisterDto registerDto = new RegisterDto(1L, "name", "surname");
        model.addAttribute("key_thymeleaf3", registerDto);
        return "thymeleaf3"; //HTML SAYFASI
    }

    // http://localhost:2222/mvc/api/redirect4
    // http://localhost:2222/mvc/api/redirect4/44
    @GetMapping({"/redirect4", "/redirect4/{id}"}) //URL
    public String getThymeleaf4(@PathVariable(name = "id", required = false) Long id, Model model) {
        if (id == null) {
            model.addAttribute("key_thymeleaf4", "404 NotFound Değer yoktur");
        } else if (id == 0) {
            model.addAttribute("key_thymeleaf4", "400 Bad Request Kötü istek");
        } else {
            RegisterDto registerDto = new RegisterDto(id, "name", "surname");
            model.addAttribute("key_thymeleaf4", registerDto);
        }
        return "thymeleaf4"; //HTML SAYFASI
    }


    // http://localhost:2222/mvc/api/redirect5?id=10
    @GetMapping("/redirect5") //URL
    public String getThymeleaf5(@RequestParam(name = "id",required = false) Long id, Model model) {
        if (id == null) {
            model.addAttribute("key_thymeleaf5", "404 NotFound Değer yoktur");
        } else if (id == 0) {
            model.addAttribute("key_thymeleaf5", "400 Bad Request Kötü istek");
        } else {
            RegisterDto registerDto = new RegisterDto(id, "name", "surname");
            model.addAttribute("key_thymeleaf5", registerDto);
        }
        return "thymeleaf5"; //HTML SAYFASI
    }


    // http://localhost:2222/mvc/api/redirect6
    @GetMapping("/redirect6") //URL
    public String getThymeleaf6(Model model) {
        List<RegisterDto> registerDtoList = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            RegisterDto registerDto = new RegisterDto(Long.valueOf(i), "name " + i, "surname " + i);
            registerDtoList.add(registerDto);
        }
        model.addAttribute("key_thymeleaf6", registerDtoList);
        return "thymeleaf6"; //HTML SAYFASI
    }

}
