package com.hamitmizrak.oop.inheritancex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private String surname;
    private String emailAddress;
    private String cityName;

    public void fullName(String name,String surname){
        System.out.println(name+" ==> "+surname);
    }
}
