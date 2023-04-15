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
public class _15_Diziler3 {

    public static void main(String[] args) {
        // Diziler
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        for (int i = 0; i < matrix.length; i++) {//satır
            for (int k = 0; k < matrix[i].length; k++) {//sutun
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println();
        }
    }

}
