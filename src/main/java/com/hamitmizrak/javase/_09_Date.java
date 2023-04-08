package com.hamitmizrak.javase;

import java.time.LocalDate;
import java.util.Date;

public class _09_Date {
    // Date
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);

        //GETTER
        System.out.println("GÜN: "+date.getDate());
        System.out.println("AY: "+date.getMonth()); //ay saymaya sıfırdan başlar
        System.out.println("YIL: "+(date.getYear()+1900));
        System.out.println("SAAT: "+date.getHours());
        System.out.println("DAKİKA: "+date.getMinutes());
        System.out.println("SANİYE: "+date.getSeconds());

        System.out.println("*******************************");

        //SETTER
        System.out.println("GÜN: "+date.getDate());
        date.setDate(1);
        System.out.println("GÜN: "+date.getDate());


        System.out.println("*******************************");
        long current=System.currentTimeMillis();
        System.out.println(current);
        System.out.println(new Date(System.currentTimeMillis()));

        System.out.println("*******************************");
        LocalDate localDate=LocalDate.of(2021,1,1);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());

    }
}
