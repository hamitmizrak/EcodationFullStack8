package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.business.dto.CustomerDto;
import com.hamitmizrak.business.services.ICustomerServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

// LOMBOK
@RequiredArgsConstructor
@Log4j2

// SPRING MVC
@Controller
@RequestMapping("/customer/mvc")
public class CustomerMvcImpl implements ICustomerMvc{

    // List,Create, Delete => gelen modelAddAttributes
    private String modelAttributesTemp=null;

    // Injection
     //private final ICustomerServices customerServices;

    // SPEED DATA
    // http://localhost:2222/customer/mvc/speed
    @Override
    @GetMapping("/speed")
    public String speedData() {
        modelAttributesTemp="5 tane veri eklendi";
        return "redirect:/customer/list";
    }

    // DELETE ALL
    // http://localhost:2222/customer/mvc/deleteAll
    @Override
    @GetMapping("/deleteAll")
    public String deleteAll() {
        modelAttributesTemp="Bütün Veriler Silindi";
        return "redirect:/customer/list";
    }

    // FAKE LİST
    @Override
    public List<CustomerDto> fakeList() {
        List<CustomerDto> customerDtoList = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            CustomerDto registerDto = CustomerDto.builder()
                    .id(Long.valueOf(i))
                    .name("name"+i)
                    .surname("surname"+i)
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
        model.addAttribute("customer_create", new CustomerDto());
        return "customer/create";
    }

    // CREATE POST
    // http://localhost:2222/customer/mvc/create
    @Override
    @PostMapping("/create")
    public String customerCreatePost(
            @Valid @ModelAttribute("customer_create") CustomerDto customerDto,
            BindingResult bindingResult,
            Model model) {
        modelAttributesTemp="Eklendi CustomerDto =>";
        return "redirect:/customer/list";
    }

    // LIST
    // http://localhost:2222/customer/mvc/list
    @Override
    @GetMapping("/list")
    public String customerListGet(Model model) {
        model.addAttribute("customer_list",fakeList());
        modelAttributesTemp=fakeList().size()+" tane veri Listelendi ";
        model.addAttribute("modelAttributesTemp",modelAttributesTemp);
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
        modelAttributesTemp="Silindi";
        return "redirect:/customer/list";
    }

    // UPDATE GET
    // http://localhost:2222/customer/mvc/update/1
    @Override
    @GetMapping("/update/{id}")
    public String customerUpdateGet(@PathVariable(name = "id") Long id, Model model) {
        modelAttributesTemp=id + " numaralı veri yoktur";
        CustomerDto customerDto=null;
        model.addAttribute("customer_update",customerDto);
        return "customer/update";
    }

    // UPDATE POST
    // http://localhost:2222/customer/mvc/update/1
    @Override
    @PostMapping("/update/{id}")
    public String customerUpdatePost(
            @PathVariable(name = "id") Long id,
            @Valid @ModelAttribute("customer_update") CustomerDto customerDto, BindingResult bindingResult, Model model) {
        modelAttributesTemp=id + " Güncellendi "+customerDto;
        return "redirect:/customer/list";
    }
} //end class
