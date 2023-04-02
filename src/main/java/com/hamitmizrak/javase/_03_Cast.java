package com.hamitmizrak.javase;

public class _03_Cast {
    public static void main(String[] args) {
        // Primitive Type ile Wrapper arasındaki fark ?
        // Heap hafıza ile Stack arasındaki farklar nelerdir ?
        // Integer.parseInt() ile Integer.valueOf() arasındaki fark ?

        //cast: dönüştürmek:
        //1-) cast
        float f1=14.56f;
        long l1=61661161616L;

        //2-)sayılar
        byte b2=12;
        long l2=b2;

        //3-) boxing => primitive Türü Wrapper çevirmek
        int primitive=1414;
        Integer wrapper=primitive;

        //  String => SAYI
        String kelime1="14";
        int sayi1=Integer.parseInt(kelime1);
        int sayi2=Integer.valueOf(kelime1);
        System.out.println(sayi1+16);
        System.out.println(sayi2+16);
        System.out.println();

        //  SAYI   => String
        int sayi3=25;
        String kelime3=String.valueOf(sayi3);
        String kelime4=Integer.toString(sayi3);
        System.out.println(kelime3+15);
        System.out.println(kelime4+15);

        //MATH:static yapıdır.
        System.out.println(Math.min(10,100));
        System.out.println(Math.max(10,100));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.abs(-5));
        System.out.println(Math.floor(4.9));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.round(6.4));
        System.out.println(Math.round(6.5));
        System.out.println(Math.sin(45));


        //Random Class

    }
}
