package com.hamitmizrak.oop.inheritancex;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// LOMBOK
@Getter @Setter
public class Student  extends  Person{

    // yeni bir özellik

    private String corona;

    // constructor
    public Student() {
    }

    // constructor
    public Student(String name, String surname, String emailAddress, String cityName, String corona) {
        super(name, surname, emailAddress, cityName);
        this.corona = corona;
    }

    //method
    @Override
    public void fullName(String name, String surname) {
        System.out.println("Öğrenci "+name+surname);
    }

    //toString

    @Override
    public String toString() {
        return "Student{" +
                "corona='" + corona + '\'' +
                "} " + super.toString();
    }
}
