package com.hamitmizrak.javase.oop.abstractx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
abstract public class Person {
    private String name;
    private String surname;
    private String emailAddress;
    private String cityName;

    //gövdeli method
    public void fullName(String name, String surname) {
        System.out.println(name + " ==> " + surname);
    }

    abstract public void govdesizMethod(String data);
}
