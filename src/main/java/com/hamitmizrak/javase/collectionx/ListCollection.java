package com.hamitmizrak.javase.collectionx;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// diziler: eleman sayısı sabitti.
// collection: eleman sayısı sabit değildir.
// LinkedList,ArrayList
public class ListCollection {

    public static void main(String[] args) {
        //List<String> listem=new LinkedList<>();
        List<String> listem=new LinkedList<>();
        listem.add("Malatya");
        listem.add("Malatya");
        listem.add("Diyarbakır");
        listem.add("Bitlis");
        listem.add("Urfa");
        listem.add("Amerika");

        System.out.println("geçiyor mu ? "+listem.contains("Bitlis"));
        Collections.sort(listem);

        // iterative for
        System.out.println("Elaman sayısı: "+listem.size());
        for (int i = 0; i <listem.size() ; i++) {
            System.out.print(listem.get(i)+" ");
        }
        listem.remove("Amerika");
        // for each for
        System.out.println("\n******\n");
        for (String  temp : listem) {
            System.out.print(temp+" ");
        }

        // Stream forEach for
        System.out.println("\n******\n");
        listem.stream().forEach((temp)->{
            System.out.print(temp+" ");
        });

        listem.clear();
        // Stream forEach for
        System.out.println("\n******\n");
        listem.stream().forEach(System.out::println);
    }
}
