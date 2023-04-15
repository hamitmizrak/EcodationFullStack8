package com.hamitmizrak.javase;

import java.io.File;

// File
// Thread
// Generics
// Collection
// OOP (class,interface,inheritance,abstract)
// Java8 (Stream API)
public class _18_File {
    public static void main(String[] args) {
        String URL="C:\\io\\ecodation\\eco8.txt";
        File file=new File(URL);
        System.out.println("Dosya mısın "+file.isFile());
        System.out.println("Dizin misin "+file.isDirectory());
        System.out.println("canExecute "+file.canExecute());
        System.out.println("canWrite "+file.canWrite());
        System.out.println("canRead "+file.canRead());
        System.out.println("getAbsolutePath:  "+file.getAbsolutePath());
        System.out.println("Path:  "+file.getPath());
        System.out.println("getParentFile:  "+file.getParentFile());
        System.out.println("getName:  "+file.getName());
        System.out.println("getFreeSpace:  "+file.getFreeSpace());
        System.out.println("getTotalSpace:  "+file.getTotalSpace());

        //Dosya yazmak dosya okumak
        //FileWriter BufferedWriter
        //FileReader BufferedReader
    }
}
