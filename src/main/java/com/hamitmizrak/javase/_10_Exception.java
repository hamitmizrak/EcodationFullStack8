package com.hamitmizrak.javase;

import java.io.IOException;

public class _10_Exception {

    public static void main(String[] args) throws IOException, IndexOutOfBoundsException, ArithmeticException, HamitMizrakException {
        // Exception Handling
        System.out.println("1.alan");
        try {
            int number = 4 / 0;
            System.out.println(number);
        } catch (ArithmeticException ai) {
            System.out.println("İstisna: " + ai);
            ai.printStackTrace();
        } catch (Exception exception) {
            System.out.println("İstisna: " + exception);
        } finally {
            System.out.println("db.close");
        }
        System.out.println("2.alan");

        // throw  new IndexOutOfBoundsException("Zorunlu istisnalar meydana getiririz.");
        // throw  new HamitMizrakException("Special Exception Zorunlu istisnalar meydana getiririz.");

    }
}
