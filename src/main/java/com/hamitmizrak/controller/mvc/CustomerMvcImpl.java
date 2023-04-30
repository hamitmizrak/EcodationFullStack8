package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.business.dto.CustomerDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/customer/mvc")
public class CustomerMvcImpl implements ICustomerMvc{

    // SPEED DATA
    // http://localhost:2222//customer/mvc/speed
    @Override
    @GetMapping("/speed")
    public String speedData() {
        return null;
    }

    // DETETE ALL
    // http://localhost:2222//customer/mvc/deleteAll
    @Override
    @GetMapping("/deleteAll")
    public String deleteAll() {
        return null;
    }

    // FAKE LİST
    @Override
    public List<CustomerDto> fakeList() {
        return null;
    }

    // CREATE GET
    // http://localhost:2222//customer/mvc/create
    @Override
    @GetMapping("/create")
    public String customerCreateGet(Model model) {
        return null;
    }

    // CREATE POST
    // http://localhost:2222//customer/mvc/create
    @Override
    @PostMapping("/create")
    public String customerCreatePost(CustomerDto customerDto, BindingResult bindingResult, Model model) {
        return null;
    }

    // LIST
    // http://localhost:2222//customer/mvc/list
    @Override
    @GetMapping("/list")
    public String customerListGet(Model model) {
        return null;
    }

    // FIND
    // http://localhost:2222//customer/mvc/find/1
    @Override
    @GetMapping("/find/{id}")
    public String customerFindGet(@PathVariable(name="id") Long id, Model model) {
        return null;
    }

    // DELETE
    // http://localhost:2222//customer/mvc/delete/1
    @Override
    @GetMapping("/delete/{id}")
    public String customerDeleteGet(@PathVariable(name="id") Long id, Model model) {
        return null;
    }

    // UPDATE GET
    // http://localhost:2222/customer/mvc/update/1
    @Override
    @GetMapping("/update/{id}")
    public String customerUpdateGet(@PathVariable(name="id") Long id, Model model) {
        return null;
    }

    // UPDATE POST
    // http://localhost:2222/customer/mvc/update/1
    @Override
    @PostMapping("/update/{id}")
    public String customerUpdatePost(@PathVariable(name="id") Long id, CustomerDto customerDto, BindingResult bindingResult, Model model) {
        return null;
    }
} //end class
