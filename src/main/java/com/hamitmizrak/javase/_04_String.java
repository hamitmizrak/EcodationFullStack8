package com.hamitmizrak.javase;

public class _04_String {
    // String nedir ?
    // StringBuilder StringTokenize
    // Conditional (if-else)
    // debug nedir ? intellij idea
    // Loop (for-while-dowhile)
    // for Each döngüsü

    public static void main(String[] args) {
        String vocabulary="Java öğreniyorum Java ";
        System.out.println(vocabulary);
        System.out.println(vocabulary.length());
        System.out.println(vocabulary.trim().length());
        System.out.println(vocabulary.toLowerCase());
        System.out.println(vocabulary.toUpperCase());
        System.out.println(vocabulary.startsWith("J"));
        System.out.println(vocabulary.endsWith(" "));

        System.out.println(vocabulary.indexOf("Java"));
        System.out.println(vocabulary.lastIndexOf("Java"));
        System.out.println(vocabulary.charAt(2)); // 1<=X<=3-1

        System.out.println(vocabulary.substring(1));
        System.out.println(vocabulary.substring(1,3)); // 1<=X<=3-1

        System.out.println(vocabulary.concat("x1").concat("x2"));
        System.out.println(vocabulary.replace(vocabulary,"yeni"));

    }
}
