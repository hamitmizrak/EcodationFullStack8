package com.hamitmizrak.oop.abstractx;

public class AbstractMainClass {
    public static void main(String[] args) {

        //abstract: new yapamazsın.
        Person person=new Teacher(); //polymorphism
        person.setName("person adı 1");
        person.setSurname("person soyadı 1");
        person.setEmailAddress("person email address 1");
        person.setCityName("person city 1");
        person.fullName(person.getName(), person.getSurname());
        person.govdesizMethod("XYZ"); //polymorphism
        System.out.println(person);

        System.out.println("**********************");

        Teacher teacher=new Teacher();
        teacher.setName("teacher adı 1");
        teacher.setSurname("teacher soyadı 1");
        teacher.setEmailAddress("teacher email address 1");
        teacher.setCityName("teacher city 1");
        teacher.fullName(teacher.getName(), teacher.getSurname());
        person.govdesizMethod("INC");
        System.out.println(teacher);

        System.out.println("**********************");

        Student student=new Student();
        student.setName("student adı 1");
        student.setSurname("student soyadı 1");
        student.setEmailAddress("student email address 1");
        student.setCityName("student city 1");
        student.setCityName("teacher city 1");
        student.setCorona("Corona XYZ");
        student.fullName(student.getName(), student.getSurname());
        System.out.println(student);
    }
}
