package com.hamitmizrak.javase;

// Class
// OOP common information()
// inheritance
// abstract
// interface
// generics
// Collection(Data Structes)

// Javada 1 tane public class vardır (inner class hariç)
// Her class bir amaç için kullanalım.

// Override
// Overloading
//
// Global variable
// static variable
// Class değişkeni
// constructur (parametreli, parametresiz constructor)
// toString
// equals , HashCode
// getter and setter
// encapsulation
// super keyword
// this keyword
// polymorphism



// OOP prensible

// static
// final
// instance
// new, null, zero
// Object

import java.util.Objects;

//BEAN
public class _23_Class2 {

    //class değişkeni
    private static String password="Hm123456@.";

    // public, private, protected, friendly
    // private: encapsulation
    // Global Variable
    private String name;
    private String surname;
    private String email;
    private String addres;

    //constructor (Kurucu metotlar)
    // return olmaz:
    public _23_Class2(){ //parametresiz constructor
        // this: global değişkene erişmek için kullanırız.
        // this: diğer constructrorları çağırmak için kullanırız.
        this.name="adınızı girmediniz";
        this.surname="surname girmediniz";
        this.email="email girmediniz";
        this.addres="address girmediniz";
    }

    //parametreli constructor.
    //Overloading: aynı metotun parametre sayısı veya değişken türleri farklıysa
    public _23_Class2(String name, String surname, String emailData,String addres){ //parametreli constructor
        this.name=name;
        this.surname=surname;
        email=emailData;
        this.addres=addres;
    }

    // Metotlar
    public void fullName(){
        System.out.println(this.name+" "+this.surname);
    }

    // toString
    // Classın kısaca kimliği
    // Alt+Ins
    // right click ==> Generate ==> Getter And Setter
    @Override
    public String toString() {
        return "_23_Class{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", addres='" + addres + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // hashCode: Her classın unique bir tane parmak izi vardır

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        _23_Class2 class2 = (_23_Class2) o;
        return Objects.equals(name, class2.name) && Objects.equals(surname, class2.surname) && Objects.equals(email, class2.email)
                && Objects.equals(addres, class2.addres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email,addres);
    }


    // Getter Setter
    // right click ==> Generate ==> Getter And Setter

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        _23_Class2.password = password;
    }

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

    public String getAddress() {
        return addres;
    }

    public void setAddress(String addres) {
        this.addres = addres;
    }
}
