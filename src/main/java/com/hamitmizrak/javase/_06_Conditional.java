package com.hamitmizrak.javase;

public class _06_Conditional {

    // debug nedir ? intellij idea
    // Loop (for-while-dowhile)
    // for Each döngüsü
    public static void main(String[] args) {
        // Conditional (if-else)
        int number=-5;
        if(number>0){
            System.out.println("pozitif");
        }else{
            System.out.println("negatif");
        }

        //ternary
        String data2=(number>0) ? "pozitif":"negatif";
        System.out.println(data2);
    }
}
