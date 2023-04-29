package com.hamitmizrak.oop.inheritancex;

public class Teacher  extends  Person{

    @Override
    public void fullName(String name, String surname) {
        System.out.println("Öğretmen "+name+surname);
    }
}
