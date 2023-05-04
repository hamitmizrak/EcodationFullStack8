package com.hamitmizrak.javase.collectionx;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MapCollection {
    public static void main(String[] args) {
        Map<String,Object> mapList=new HashMap<>();
        mapList.put("1","Malatya");
        mapList.put("2","Elazığ");
        mapList.put("3","Van");
        mapList.put(UUID.randomUUID().toString(),"Bitlis");

        System.out.println( mapList.size());

        for(String key: mapList.keySet()){
            System.out.print(key+" ");
        }
        System.out.println("\n#####");

        for(Object value: mapList.values()){
            System.out.print(value+" ");
        }

        System.out.println("\n#####");
        for(String key: mapList.keySet()){
            System.out.println( key+" ==> "+mapList.get(key));
        }
    }
}
