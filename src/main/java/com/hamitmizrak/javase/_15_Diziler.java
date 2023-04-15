package com.hamitmizrak.javase;


public class _15_Diziler {

    public static void main(String[] args) {
        // Diziler
        int [] dizi=new int[5];
        dizi[0]=1;
        dizi[1]=2;
        dizi[2]=3;
        dizi[4]=4;
        System.out.println(dizi[0]+dizi[4]);
        System.out.println(dizi[3]);
        System.out.println(dizi.length);

        System.out.println("********************");
        //iterative For
        for (int i = 0; i <dizi.length ; i++) {
            System.out.print(dizi[i]+" ");
        }
        System.out.println("\n********************");
        //for each
        for (int temp : dizi) {
            System.out.print(temp+" ");
        }

    }

}
