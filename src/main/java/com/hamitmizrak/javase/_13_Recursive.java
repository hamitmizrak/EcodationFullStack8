package com.hamitmizrak.javase;

import java.util.Scanner;
import java.util.UUID;

public class _13_Recursive {

    public static int scannerData() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number = klavye.nextInt();
        return number;
    }

    public static void iterativeFaktoriyel(int number) {
        int factoriyel = 1;
        if (number < 0) {
            System.out.println("Sıfırdan küçük sayı giremezsiniz");
            number = Math.abs(number);
        }
        for (int i = number; i >= 1; i--) {
            //factoriyel=factoriyel*i;
            factoriyel *= i;
        }
        System.out.println(number + " sayısının faktöriyeli: " + factoriyel);
    }

    public static Integer recursiveFaktoriyel(int number) throws HamitMizrakException {
        if (number < 0)
            throw new HamitMizrakException("Sıfırdan küçük giremezsiniz");
        if (number == 0 || number == 1)
            return 1;
        return number * recursiveFaktoriyel(number - 1);
    }


    public static void main(String[] args) throws HamitMizrakException {
        // UUID
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);

        // Recursive
        // Faktöriyel(iterative, recursive)
        int number=scannerData();
        iterativeFaktoriyel(number);
        System.out.println(recursiveFaktoriyel(number));


    }
}
