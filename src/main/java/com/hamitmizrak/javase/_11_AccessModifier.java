package com.hamitmizrak.javase;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class _11_AccessModifier {


    //1-) voidliParametresiz
    public static void voidliParametresiz() {
        System.out.println("voidli Parametresiz");
    }

    //2-) voidliParametresiz
    public static void voidliParametreli(String name) {
        System.out.println("voidli Parametreli " + name);
    }

    //3-) voidsizParametresiz
    public static String voidsizParametresiz() {
        return "voidsiz Parametresiz";
    }

    //4-) voidsizParametresiz
    public static String voidsizParametreli(int number) {
        return "voidsiz Parametreli " + number;
    }

    //4-) voidsizParametresiz:Overloading
    public static String voidsizParametreli(int number, int number2) {
        return "voidsiz Parametreli " + number + number2;
    }


    public static void main(String[] args) throws IOException, IndexOutOfBoundsException, ArithmeticException, HamitMizrakException {
        // Access Modifier:public:bonkör,private:cimri
        // Encapsulation:Sadece bilmem gerekenleri bilsem yeterli gerisi ıvır zıvır.
        // Override: Köyün Muhtarı.

        // Method:
        // Overloading:
        voidliParametresiz();
        voidliParametreli("JAVA");//argüman:Metota verilen değer

        String data3 = voidsizParametresiz();
        System.out.println(data3);

       /* Scanner scanner=new Scanner(System.in);
        System.out.println("\nLütfen bir sayı giriniz");
        int number=scanner.nextInt();*/

        //JOptionPane
        int number = Integer.valueOf(JOptionPane.showInputDialog("Lütfen bir sayı giriniz"));
        String data4 = voidsizParametreli(number);
        System.out.println(data4);

        // UUID
        // Recursive
        // Faktöriyel(iterative, recursive)
        // Enum
        // Diziler
        // inner class
        // File
    }
}
