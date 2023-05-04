package com.hamitmizrak.controller.jdbctemplate;
import com.hamitmizrak.business.dto.CustomerDto;
import java.util.List;
import java.util.Optional;

public interface ICustomerJdbcTemplate {

    // SAVE
    int save(CustomerDto customerDto);

    // LIST
    List<CustomerDto> findAll();

    // UPDATE
    int update(CustomerDto customerDto);

    // DELETE BYID
    int deleteById(Long id);

    // COUNT
    int count();

    // FIND
    Optional<CustomerDto> findById(Long id);

    // FIND GetName
    String getNameById(Long id);

    // LIKE
    List<CustomerDto> findByNameAndSurname(String name, String surname);
}


