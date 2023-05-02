package com.hamitmizrak.business.services;
import com.hamitmizrak.business.dto.CustomerDto;
import com.hamitmizrak.data.entity.CustomerEntity;
import java.util.List;

public interface ICustomerServices {

    // MODEL MAPPER
    public CustomerDto EntityToDto(CustomerEntity customerEntity);
    public CustomerEntity DtoToEntity(CustomerDto customerDto);

    // SPEED DATA
    public List<CustomerDto> speedData();

    // DELETE ALL
    public  void deleteAll();

    // SORTING PAGING
    List<CustomerDto>  customerSortingAsc();
    List<CustomerDto>  customerSortingDesc();
    List<CustomerDto>  customerPaging(int page, int size);


    // CREATE POST
    CustomerDto customerCreate(CustomerDto customerDto);

    // LIST
    List<CustomerDto>  customerList();

    // FIND
    CustomerDto customerFind(Long id);

    // DELETE
    CustomerDto customerDelete(Long id);


    // UPDATE POST
    CustomerDto customerUpdate(Long id, CustomerDto customerDto);
}
