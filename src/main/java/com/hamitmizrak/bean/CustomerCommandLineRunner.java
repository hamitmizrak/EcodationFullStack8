package com.hamitmizrak.bean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//  Projemiz ayağa kalktığında otomatik 10 tane veri ekleyecek
@Configuration
public class CustomerCommandLineRunner {

    // injection

    @Bean
    public CommandLineRunner customerAutomaticData(){
        return (args)->{

        };
    }
}
