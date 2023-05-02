package com.hamitmizrak.bean;

import com.hamitmizrak.data.entity.CustomerEntity;
import com.hamitmizrak.data.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

// LOMBOK
@RequiredArgsConstructor

//  Projemiz ayağa kalktığında otomatik 10 tane veri ekleyecek
@Configuration
public class CustomerCommandLineRunner {

    // 1.YOL => Field injection
    /*
    @Autowired
    private ICustomerRepository iCustomerRepository;
    */

    //2.YOL => Constructor Injection
    /*
    private final ICustomerRepository iCustomerRepository;
    @Autowired
    public CustomerCommandLineRunner(ICustomerRepository iCustomerRepository) {
        this.iCustomerRepository = iCustomerRepository;
    }
    */

    //3.YOL => Lombok Constructor Injection
    private final ICustomerRepository iCustomerRepository;

    @Bean
    public CommandLineRunner customerAutomaticData() {
        return (args) -> { // lambda expression : java8
            for (int i = 1; i <=10; i++) {
                CustomerEntity customerEntity= CustomerEntity.builder()
                        .name("adı"+i)
                        .surname("soyadı"+i)
                        .email(UUID.randomUUID().toString()+"@gmail.com")
                        .password("password"+i)
                        .build();
                iCustomerRepository.save(customerEntity);
            } //end for
        }; // end return
    } // end CommandLineRunner
}// end CustomerCommandLineRunner
