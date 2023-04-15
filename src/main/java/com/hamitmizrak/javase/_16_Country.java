package com.hamitmizrak.javase;


// inner class
// File
// Serileştirme
// OOP (class,interface,inheritabce,abstract)
// Generics
// Collection
// Java8 (Stream API)
// Thread

import lombok.Getter;
import lombok.Setter;

// Inner Class: iç içe classlar.
// Javada 1 tane public class vardır(inner Class hariç).
// Javada static class yoktur(inner Class hariç).
public class _16_Country {

    @Getter
    @Setter
    public String countryName;

    public static class City {
        @Getter
        @Setter
        public String cityName;
    }
}

class MainInnerClass{
    public static void main(String[] args) {
        _16_Country country=new _16_Country();
        country.setCountryName("Turkiye");

        _16_Country.City city=new _16_Country.City();
        city.setCityName("Malatya");
        System.out.println("Ülke "+country.getCountryName()+" Şehir: "+city.getCityName());
    }
}
