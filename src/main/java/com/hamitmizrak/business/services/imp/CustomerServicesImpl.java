package com.hamitmizrak.business.services.imp;

import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.bean.PasswordEncoderBean;
import com.hamitmizrak.business.dto.CustomerDto;
import com.hamitmizrak.business.services.ICustomerServices;
import com.hamitmizrak.data.entity.CustomerEntity;
import com.hamitmizrak.data.repository.ICustomerRepository;
import com.hamitmizrak.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// LOMBOK
@RequiredArgsConstructor //injection

//Services
@Service
public class CustomerServicesImpl implements ICustomerServices {

    // injection
    private final ICustomerRepository iCustomerRepository;
    private final ModelMapperBean modelMapperBean;
    private final PasswordEncoderBean passwordEncoderBean;


    // MODEL MAPPER
    @Override
    public CustomerDto EntityToDto(CustomerEntity customerEntity) {
        return modelMapperBean.modelMapperMethod().map(customerEntity,CustomerDto.class);
    }

    @Override
    public CustomerEntity DtoToEntity(CustomerDto customerDto) {
        return modelMapperBean.modelMapperMethod().map(customerDto,CustomerEntity.class);
    }

    // SPEED DATA
    @Override
    public List<CustomerDto> speedData() {
        List<CustomerDto> list=new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            CustomerDto customerDto = null;
            CustomerEntity customerEntity = CustomerEntity.builder()
                    .name("name" + i)
                    .surname("surname" + i)
                    .password(passwordEncoderBean.passwordEncoderMethod().encode("root"))
                    .email(UUID.randomUUID().toString().concat("@gmail.com"))
                    .build();
            iCustomerRepository.save(customerEntity);
            customerDto = EntityToDto(customerEntity);
            list.add(customerDto);
            System.out.println(customerDto);
        }
        return list;
    }


    // DELETE ALL
    @Override
    public void deleteAll() {
        List<CustomerDto> list=new ArrayList<>();
        iCustomerRepository.deleteAll();
    }

    //SORTING / PAGING
    @Override
    public List<CustomerDto> customerSortingAsc() {
        return null;
    }

    @Override
    public List<CustomerDto> customerSortingDesc() {
        return null;
    }

    @Override
    public List<CustomerDto> customerPaging(int page, int size) {
        return null;
    }

    // CREATE
    @Override
    public CustomerDto customerCreate(CustomerDto customerDto) {
        // password masking
        customerDto.setPassword(passwordEncoderBean.passwordEncoderMethod().encode(customerDto.getPassword()));
        CustomerEntity customerEntity=DtoToEntity(customerDto);
        iCustomerRepository.save(customerEntity);
        customerDto.setId(customerEntity.getId());
        return customerDto;
    }

    // LİST
    @Override
    public List<CustomerDto> customerList() {
        List<CustomerEntity> entityList=  iCustomerRepository.findAll();
        List<CustomerDto> customerDtoList=new ArrayList<>();
        for(CustomerEntity entity:   entityList){
            CustomerDto customerDto=  EntityToDto(entity);
            customerDtoList.add(customerDto);
        }
        return customerDtoList;
    }

    // FİND
    @Override
    public CustomerDto customerFind(Long id) {
        CustomerEntity customerEntity= iCustomerRepository.findById(id).orElseThrow(
                ()->new NotFoundException(id+" numaralı id bulunamadı")
        );
        CustomerDto customerDto=EntityToDto(customerEntity);
        return customerDto;
    }

    // DELETE
    @Override
    public CustomerDto customerDelete(Long id) {
        CustomerDto customerDtoFind= customerFind(id);
        CustomerEntity customerEntity=DtoToEntity(customerDtoFind);
        iCustomerRepository.delete(customerEntity);
        return customerDtoFind;
    }

    // UPDATE
    @Override
    public CustomerDto customerUpdate(Long id, CustomerDto customerDto) {
        // password masking root
        customerDto.setPassword(passwordEncoderBean.passwordEncoderMethod().encode(customerDto.getPassword()));
        // find
        CustomerDto customerDtoFind= customerFind(id);
        CustomerEntity customerEntity=DtoToEntity(customerDtoFind);
        //updated
        customerEntity.setName(customerDto.getName());
        customerEntity.setSurname(customerDto.getSurname());
        customerEntity.setEmail(customerDto.getEmail());
        customerEntity.setPassword(customerDto.getPassword());
        iCustomerRepository.save(customerEntity);
        // id almak
        customerDto.setId(customerDto.getId());
        return customerDto;
    }
} // end class
