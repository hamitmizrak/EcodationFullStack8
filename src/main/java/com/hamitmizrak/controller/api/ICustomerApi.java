package com.hamitmizrak.controller.api;

import com.hamitmizrak.business.dto.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import java.util.List;

public interface ICustomerApi {

    // SPEED DATA
    // http://localhost:2222/customer/api/speed
    ResponseEntity<List<CustomerDto>> speedData();

    // DELETE ALL
    // http://localhost:2222/customer/api/deleteAll
    ResponseEntity<List<CustomerDto>> deleteAll();

    // CREATE POST
    // http://localhost:2222/customer/api/create
    ResponseEntity<CustomerDto> customerCreatePost(CustomerDto customerDto);

    // LIST
    // http://localhost:2222/customer/api/list
    ResponseEntity<List<CustomerDto>> customerList();

    // FIND
    // http://localhost:2222/customer/api/find/1
    ResponseEntity<?> customerFindGetById(Long id);

    // DELETE
    // http://localhost:2222/customer/api/delete/1
    ResponseEntity<CustomerDto> customerDelete(Long id, Model model);

    // UPDATE POST
    // http://localhost:2222/customer/api/update/1
    ResponseEntity<CustomerDto> customerUpdatePost(Long id, CustomerDto customerDto);
}
