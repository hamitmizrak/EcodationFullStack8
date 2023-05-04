package com.hamitmizrak.controller.api;

import com.hamitmizrak.business.dto.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.List;

//@controller
public interface ICustomerApi {

    // SPEED DATA
    // http://localhost:2222/customer/api/speed
     ResponseEntity<List<CustomerDto>> speedData();

    // DELETE ALL
    // http://localhost:2222/customer/api/deleteAll
    CustomerDto deleteAll();

    // CREATE POST
    // http://localhost:2222/customer/api/create
    CustomerDto customerCreatePost(CustomerDto customerDto);

    // LIST
    // http://localhost:2222/customer/api/list
   List<CustomerDto>  customerList();

    // FIND
    // http://localhost:2222/customer/api/find/1
    CustomerDto customerFindGetById( Long id);

    // DELETE
    // http://localhost:2222/customer/api/delete/1
    CustomerDto customerDelete(Long id, Model model);


    // UPDATE POST
    // http://localhost:2222/customer/api/update/1
    CustomerDto customerUpdatePost(Long id, CustomerDto customerDto);
}
