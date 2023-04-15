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
        int sum=0;
        int oddCounter=0,oddSum=0;
        int evenCounter=0,evenSum=0;

        Random random=new Random();
        //diziye rastgele sayılar eklemek
        for (int i = 0; i <dizi.length ; i++) {
            int number=random.nextInt(9)+1;
            dizi[i]=number;
            sum+=dizi[i];
            if(dizi[i]%2==1){
                oddCounter++;
                oddSum+=dizi[i];
            }else{
                evenCounter++;
                evenSum+=dizi[i];
            }
            if(dizi[i]==4){
                System.out.println("special number");
            }
        }
        Arrays.sort(dizi);
        //for each
        for (int temp : dizi) {
            System.out.print(temp+" ");
        }
        System.out.println("\n****************");
        // Bu dizide En küçük eleman nedir ?
        System.out.println(dizi[0]);

        // Bu dizide En büyük eleman nedir ?
        System.out.println(dizi[dizi.length-1]);

        // Bu dizide eleman toplamları nedir ?
        System.out.println("Toplamları : "+sum);

        // Bu dizide tek sayı adeti nedir ?
        System.out.println("Tek sayı adeti : "+oddCounter);

        // Bu dizide tek sayı toplamları nedir ?
        System.out.println("Tek sayı oddSum : "+oddSum);

        // Bu dizide çift sayı adeti nedir ?
        System.out.println("Çift sayı adeti : "+evenCounter);

        // Bu dizide çift sayı toplamları nedir ?
        System.out.println("Çift sayı oddSum : "+evenSum);

        // eğer bu sayılardan 4 varsa ekranda bu sayı "special number" yazsın.




    }

}
