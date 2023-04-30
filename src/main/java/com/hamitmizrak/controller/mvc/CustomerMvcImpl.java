package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.business.dto.CustomerDto;
import com.hamitmizrak.business.dto.RegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/customer/mvc")
public class CustomerMvcImpl implements ICustomerMvc{

    // SPEED DATA
    // http://localhost:2222/customer/mvc/speed
    @Override
    @GetMapping("/speed")
    public String speedData() {
        return "redirect:/customer/list";
    }

    // DETETE ALL
    // http://localhost:2222/customer/mvc/deleteAll
    @Override
    @GetMapping("/deleteAll")
    public String deleteAll() {
        return "redirect:/customer/list";
    }

    // FAKE LİST
    @Override
    public List<CustomerDto> fakeList() {
        List<CustomerDto> customerDtoList = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            CustomerDto registerDto = CustomerDto.builder()
                    .id(Long.valueOf(i))
                    .username("username"+i)
                    .password(UUID.randomUUID().toString())
                    .email("email"+i+"@gmail.com")
                    .systemDate(new Date(System.currentTimeMillis()))
                    .build();
            customerDtoList.add(registerDto);
        }
        return customerDtoList;
    }

    // CREATE GET
    // http://localhost:2222/customer/mvc/create
    @Override
    @GetMapping("/create")
    public String customerCreateGet(Model model) {
        return "customer/create";
    }

    // CREATE POST
    // http://localhost:2222/customer/mvc/create
    @Override
    @PostMapping("/create")
    public String customerCreatePost(CustomerDto customerDto, BindingResult bindingResult, Model model) {
        return "redirect:/customer/list";
    }

    // LIST
    // http://localhost:2222/customer/mvc/list
    @Override
    @GetMapping("/list")
    public String customerListGet(Model model) {
        model.addAttribute("customer_list",fakeList());
        return "customer/list";
    }

    // FIND
    // http://localhost:2222/customer/mvc/find/1
    @Override
    @GetMapping("/find/{id}")
    public String customerFindGet(@PathVariable(name = "id") Long id, Model model) {
        return "customer/view";
    }

    // DELETE
    // http://localhost:2222/customer/mvc/delete/1
    @Override
    @GetMapping("/delete/{id}")
    public String customerDeleteGet(@PathVariable(name = "id") Long id, Model model) {
        return "redirect:/customer/list";
    }

    // UPDATE GET
    // http://localhost:2222/customer/mvc/update/1
    @Override
    @GetMapping("/update/{id}")
    public String customerUpdateGet(@PathVariable(name = "id") Long id, Model model) {
        return "customer/update";
    }

    // UPDATE POST
    // http://localhost:2222/customer/mvc/update/1
    @Override
    @PostMapping("/update/{id}")
    public String customerUpdatePost(@PathVariable(name = "id") Long id, CustomerDto customerDto, BindingResult bindingResult, Model model) {
        return "redirect:/customer/list";
    }
} //end class
