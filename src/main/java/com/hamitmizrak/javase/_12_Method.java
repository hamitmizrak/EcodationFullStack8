package com.hamitmizrak.javase;

import java.io.IOException;
import java.util.Scanner;

public class _12_Method {

    // Adım1: String dönüşlü bir metot yazalım
    // Adım2: Kullanıcıdan alınan isim ve soyisimi parametre olarak alalım
    // Adım3: return yapmadan önce ,isimin ilk karakteri büyük, soyismin bütün karakterliri büyük yaparak dönsün
    // Örneğin: hamit mızrak ==> Hamit MIZRAK
    // İpucu: Hamit ==> charAt ve Loop kullanının.
    public static String usernameSurname() {
        Scanner klavye = new Scanner(System.in);
        String username, surname;

        System.out.println("Lütfen Kullanıcı Adınız Giriniz");
        username = klavye.nextLine();

        System.out.println("Lütfen Kullanıcı Soyadınız Giriniz");
        surname = klavye.nextLine().toUpperCase();
        return username.concat(surname);
    }

    public static void main(String[] args) throws IOException, IndexOutOfBoundsException, ArithmeticException, HamitMizrakException {
        String data = usernameSurname();
        System.out.println(data);
        // UUID
        // Recursive
        // Faktöriyel(iterative, recursive)
        // Enum
        // Diziler
        // inner class
        // File
    }
}
