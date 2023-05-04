package com.hamitmizrak.caching;

import com.hamitmizrak.business.dto.CustomerDto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CachingTutorials {


    // LIST
    // http://localhost:2222/customer/api/v1/list
   /*
   @Override
    @GetMapping( "list")
    @Cacheable(value = "cacheCustomerList")
    public ResponseEntity<List<CustomerDto>> getAllCustomers() {
        return ResponseEntity.ok(customerServices.getAllCustomers());
    }
    */
}
