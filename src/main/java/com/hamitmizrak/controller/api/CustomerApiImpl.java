package com.hamitmizrak.controller.api;

import com.hamitmizrak.business.dto.CustomerDto;
import com.hamitmizrak.business.services.ICustomerServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// LOMBOK
@RequiredArgsConstructor // constructor injection

// REST
@RestController
@RequestMapping("/customer/api/v1/")
@CrossOrigin //CORS
// Dış dünyaya açılan kapı
public class CustomerApiImpl implements ICustomerApi {

    // injection
    private final ICustomerServices customerServices;


    // SPEED DATA
    // http://localhost:2222/customer/api/v1/speed
    @Override
    @GetMapping("/speed")
    public ResponseEntity<List<CustomerDto>> speedData() {
        return ResponseEntity.ok(customerServices.speedData());
    }

    // DELETE ALL
    // http://localhost:2222/customer/api/v1/deleteAll
    @Override
    @GetMapping("/deleteAll")
    public ResponseEntity<?> deleteAll() {
        customerServices.deleteAll();
        return ResponseEntity.ok("Bütün datalar silindi.");
    }

    // CREATE POST
    // http://localhost:2222/customer/api/v1/create
    @Override
    @PostMapping(value = "create")
    //@Transactional // create, delete,update
    public ResponseEntity<CustomerDto> customerCreatePost(@Valid @RequestBody CustomerDto customerDto) {
        return ResponseEntity.ok(customerServices.customerCreate(customerDto));
    }

    // LIST
    // http://localhost:2222/customer/api/v1/list
    @Override
    @GetMapping("/list")
    @Cacheable(value = "customerListCacheable")
    public ResponseEntity<List<CustomerDto>> customerList() {
        return ResponseEntity.ok(customerServices.customerList());
    }

    // FIND
    // http://localhost:2222/customer/api/v1/find/1
    @Override
    @GetMapping("/find/{id}")
    @Cacheable(value = "customerFindByIdCacheable")
    public ResponseEntity<?> customerFindGetById(@PathVariable(name="id") Long id) {
        // return ResponseEntity.status(200).body(customerServices.customerFind(id));
        return ResponseEntity.ok(customerServices.customerFind(id));
    }

    // DELETE
    // http://localhost:2222/customer/api/v1/delete/1
    @Override
    @DeleteMapping("/delete/{id}")
    @Transactional // create, delete,update
    public ResponseEntity<CustomerDto> customerDelete(@PathVariable(name="id") Long id) {
        return ResponseEntity.ok(customerServices.customerDelete(id));
    }

    // UPDATE POST
    // http://localhost:2222/customer/api/v1/update/1
    @Override
    @PutMapping("/update/{id}")
    @Transactional // create, delete,update
    public ResponseEntity<CustomerDto> customerUpdatePost(@PathVariable(name="id") Long id, @Valid @RequestBody CustomerDto customerDto) {
        return ResponseEntity.ok(customerServices.customerUpdate(id,customerDto));
    }
}
