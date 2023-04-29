package com.hamitmizrak.oop.abstractx;

public class Teacher  extends Person {

    @Override
    public void fullName(String name, String surname) {
        System.out.println("Öğretmen "+name+surname);
    }

    @Override
    public void govdesizMethod(String data) {
        System.out.println("Gövdesiz Teacher Method: "+data);
    }
}
