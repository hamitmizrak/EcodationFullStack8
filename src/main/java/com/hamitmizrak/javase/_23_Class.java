package com.hamitmizrak.javase;

// POJO: plain Old Java Object
// POJO(field+getterAndSetter)
// BEAN= POJO+constructor
public class _23_Class {

    private String name;
    private String surname;
    private String email;

    //GETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
