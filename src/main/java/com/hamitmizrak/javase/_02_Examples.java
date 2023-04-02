package com.hamitmizrak.javase;

import java.util.Scanner;

public class _02_Examples {
    public static void main(String[] args) {
        // 1.soru
        // 1.dereceden 2 bilinmeyenli denklem
        // y=3x+4k;
        // x=5;
        // k=3
        // y=?
        int x=5;
        int k=3;
        int y;
        y=3*x+4*k;
        System.out.println(y);

        // 2.soru
        // Dereceyi Fahrenhayt
        // (derece*9/5)+32
        // 0 derece 32 fahrenhayttır
        double degree,fahranhayt;
        degree=0;
        fahranhayt=(degree*9/5)+32;
        System.out.println(fahranhayt);

        // 3.soru iki sayıda dört işlem
        // x1=4,x2=2;
        // bölme/çıkarma/çarpma/toplama/bölümünden kalan(%)

        //SCANNER
        Scanner klavye=new Scanner(System.in);
        int number1,number2;
        System.out.println("Lütfen bir sayı giriniz");
        number1=klavye.nextInt();
        System.out.println("Lütfen ikinci sayı giriniz");
        number2=klavye.nextInt();

        System.out.println("Topla => "+(number1+number2));
        System.out.println("Çıkarma => "+((number1-number2)));
        System.out.println("Çarpma => "+((number1*number2)));
        System.out.println("Bölme => "+((number1/number2)));
        System.out.println("Bölümenden kalan => "+((number1%number2)));

    }
}
