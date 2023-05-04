package com.hamitmizrak.controller.api;

import com.hamitmizrak.business.dto.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import java.util.List;

public interface ICustomerApi {

    // SPEED DATA
    // http://localhost:2222/customer/api/v1/speed
    ResponseEntity<List<CustomerDto>> speedData();

    // DELETE ALL
    // http://localhost:2222/customer/api/v1/deleteAll
    ResponseEntity<?> deleteAll();

    // CREATE POST
    // http://localhost:2222/customer/api/v1/create
    ResponseEntity<CustomerDto> customerCreatePost(CustomerDto customerDto);

    // LIST
    // http://localhost:2222/customer/api/v1/list
    ResponseEntity<List<CustomerDto>> customerList();

    // FIND
    // http://localhost:2222/customer/api/v1/find/1
    ResponseEntity<?> customerFindGetById(Long id);

    // DELETE
    // http://localhost:2222/customer/api/v1/delete/1
    ResponseEntity<CustomerDto> customerDelete(Long id);

    // UPDATE POST
    // http://localhost:2222/customer/api/v1/update/1
    ResponseEntity<CustomerDto> customerUpdatePost(Long id, CustomerDto customerDto);
}
