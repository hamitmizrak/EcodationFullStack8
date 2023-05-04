package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.business.dto.CustomerDto;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import java.util.List;

//@controller
public interface ICustomerMvc {

    // SPEED DATA
    // http://localhost:2222/customer/mvc/speed
    String speedData();

    // DELETE ALL
    // http://localhost:2222/customer/mvc/deleteAll
    String deleteAll();

    // FAKE LİST
    List<CustomerDto> fakeList();

    // CREATE GET
    // http://localhost:2222/customer/mvc/create
    String customerCreateGet(Model model);

    // CREATE POST
    // http://localhost:2222/customer/mvc/create
    String customerCreatePost(CustomerDto customerDto, BindingResult bindingResult, Model model);

    // LIST
    // http://localhost:2222/customer/mvc/list
    String customerListGet(Model model);

    // FIND
    // http://localhost:2222/customer/mvc/find/1
    String customerFindGet( Long id, Model model);

    // DELETE
    // http://localhost:2222/customer/mvc/delete/1
    String customerDeleteGet(Long id, Model model);

    // UPDATE GET
    // http://localhost:2222/customer/mvc/update/1
    String customerUpdateGet(Long id, Model model);

    // UPDATE POST
    // http://localhost:2222/customer/mvc/update/1
    String customerUpdatePost(Long id, CustomerDto customerDto, BindingResult bindingResult, Model model);
}
