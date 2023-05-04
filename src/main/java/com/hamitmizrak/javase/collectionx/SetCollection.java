package com.hamitmizrak.javase.collectionx;

import java.util.*;

// HashSet LinkedHashSet TreeSet
public class SetCollection {
    public static void main(String[] args) {
        //Set<String> listem=new HashSet<>();
        //Set<String> listem=new LinkedHashSet<>();
        Set<String> listem=new TreeSet<>();
        listem.add("Malatya");
        listem.add("Malatya");
        listem.add("Diyarbakır");
        listem.add("Bitlis");
        listem.add("Urfa");
        listem.add("Amerika");

        // for each for
        System.out.println("\n******\n");
        for (String  temp : listem) {
            System.out.print(temp+" ");
        }

    }
}

