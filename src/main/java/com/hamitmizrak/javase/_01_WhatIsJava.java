package com.hamitmizrak.javase;

public class _01_WhatIsJava {
    //single comment
    /*
    multiple comment
    */
    // IDE - Editor fark ?
    // compiler ile interpreter nedir ? aralarındaki farklar
    // API nedir ?
    // JDK , JRE ,JVM ?

    //psvm
    public static void main(String[] args) {
        //değişkenler
        String $_degiskenAdi44;
        //sayılarla başlanmaz $_ haricinde =>  özel simgelerle başlanmaz.

        //Operator
        System.out.println("Topla => "+(6+3));
        System.out.println("Çıkarma => "+(6-3));
        System.out.println("Çarpma => "+(6*3));
        System.out.println("Bölme => "+(6/3));
        System.out.println("Bölümenden kalan => "+(6%3));

        // &&  || !
        // > >= < <=
        int count=0;
        count=count+1;
        count+=1;
        count++;

        //Datatypes
        //Tamsayılar
         byte b1=10;
        //sout =>TAB
        short s1=128;
        int i1=2121212122;
        long l1=21212121221L;
        System.out.println(l1);

        //virgüllü sayı
        float f2=14.5656f;
        double d2=14141414.454545;

        //Boolean
        boolean b3=true;

        //Character
        char c4='@';
        System.out.println(c4);

        //


    }
}
