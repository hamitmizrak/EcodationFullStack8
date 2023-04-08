package com.hamitmizrak.javase;

public class _08_Loop {
    // Loop (for-while-dowhile)
    // for Each döngüsü
    public static void main(String[] args) {
        //FOR i++, i+=1  i=i+1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //WHILE
        int k = 1;
        while (k <= 10) {
            System.out.print(k + " ");
            k++;
        }
        System.out.println("");

      //DOWHILE
        int m = 1;
        do {
            System.out.print(m + " ");
            m++;
        } while (m <= 10);
    }
}
