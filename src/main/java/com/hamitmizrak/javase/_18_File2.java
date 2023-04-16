package com.hamitmizrak.javase;

import java.io.*;
import java.util.Scanner;

// File
// Thread
// Generics
// Collection
// OOP (class,interface,inheritance,abstract)
// Java8 (Stream API)
//
// Dosya yazmak dosya okumak
//        //FileWriter BufferedWriter
//        //FileReader BufferedReader
public class _18_File2 {

    //araştırma: final kullanım alanları nelerdir ?
    private static final String URL = "C:\\io\\ecodation\\eco8.txt";

    //Scanner
    private static String userData() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir şeyler yazınız");
        String user = klavye.nextLine();
        //user coding continue..
        return user;
    }

    //FILE WRITER
    private static void specialMyFileWriter() {
        //FILE WRITER
        String user=userData();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(URL, true))) {
            bufferedWriter.write(user + "\n");
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //FILE READER
    private static void specialMyFileReader() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(URL))) {
            StringBuilder stringBuilder = new StringBuilder();
            String rows;
            while ((rows = bufferedReader.readLine()) != null) {
                stringBuilder.append(rows).append("\n");
            }
            String writeToString = stringBuilder.toString();
            System.out.println(writeToString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void chooise() {
        while (true) {
            Scanner klavye = new Scanner(System.in);
            System.out.println("Lütfen seçim yapınız\n1-)Dosya yaz\n2-)Dosya oku\n3-)Çıkış");
            int key = klavye.nextInt();
            switch (key) {
                case 1:
                    specialMyFileWriter();
                    break;
                case 2:
                    specialMyFileReader();
                    break;
                default:
                    System.out.println("Çıkış yapıldı");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        chooise();
    }
}
