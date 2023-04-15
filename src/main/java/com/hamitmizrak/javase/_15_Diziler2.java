package com.hamitmizrak.javase;

import java.util.Arrays;
import java.util.Random;

// inner class
// File
// Serileştirme
// OOP (class,interface,inheritabce,abstract)
// Generics
// Collection
// Java8 (Stream API)
// Thread
public class _15_Diziler2 {

    public static void main(String[] args) {
        // Diziler
        int [] dizi=new int[5];

        Random random=new Random();
        //diziye rastgele sayılar eklemek
        for (int i = 0; i <dizi.length ; i++) {
            int number=random.nextInt(9)+1;
            dizi[i]=number;
        }

        // Bu dizide En küçük eleman nedir ?
        // Bu dizide En büyük eleman nedir ?
        // Bu dizide eleman toplamları nedir ?
        Arrays.sort(dizi);

        //for each
        for (int temp : dizi) {
            System.out.print(temp+" ");
        }

    }

}
