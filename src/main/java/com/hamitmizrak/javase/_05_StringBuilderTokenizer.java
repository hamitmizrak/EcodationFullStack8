package com.hamitmizrak.javase;

import java.util.StringTokenizer;

public class _05_StringBuilderTokenizer {

    public static void main(String[] args) {

        //Birleştirme
        StringBuilder builder=new StringBuilder();
        builder.append("1.alan").append("2.alan").append("3.alan");
        String data= builder.toString();
        System.out.println(data);

        System.out.println("**************************");
        //Parçalama
        String data2="javase +javaee~javame jsp$jsf";
        StringTokenizer tokenizer=new StringTokenizer(data2,"+~$ ");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
    }
}
