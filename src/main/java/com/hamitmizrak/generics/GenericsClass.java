package com.hamitmizrak.generics;

import lombok.Getter;
import lombok.Setter;

// Tür problemlerini çözmeye
// cast işlemleriyle ilgilenmek zorunda kalmazsınız
// kendi içinde tüm wrapper tiplerini barındırır.
public class GenericsClass<T> {
    @Getter
    @Setter
    private T data;

    //Generics Constructor constructor
    public GenericsClass() {
    }

    public GenericsClass(T data) {
        this.data = data;
    }

    //Generics Method
    public <T> void genericsMethod(T temp,int number){
        System.out.println(temp+" =>"+Math.sqrt(number));
    }

    //PSVM
    public static void main(String[] args) {
        GenericsClass genericsClass = new GenericsClass();
        genericsClass.setData(Boolean.TRUE);
        System.out.println(genericsClass.getData());

        System.out.println("****************************");

        GenericsClass genericsClass2 = new GenericsClass("React");
        System.out.println(genericsClass2.getData());

        System.out.println("****************************");
        genericsClass2.genericsMethod(44,25);
    }
}
