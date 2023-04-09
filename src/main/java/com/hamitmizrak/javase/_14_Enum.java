package com.hamitmizrak.javase;

public enum _14_Enum {
    PAZAR,PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI
}

//
class MainEnum{
    public static void main(String[] args) {
        _14_Enum gun=_14_Enum.CUMARTESI;
        System.out.println(gun);

        String gunStr=_14_Enum.CUMARTESI.toString();
        System.out.println(gunStr);
        System.out.println("Sıra: "+_14_Enum.CUMARTESI.ordinal());
        System.out.println("Value: "+_14_Enum.values()[6]);
    }
}
