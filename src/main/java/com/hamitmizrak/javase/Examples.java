package com.hamitmizrak.javase;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Random;
import java.util.Scanner;

public class Examples {

    // AKLINDA BİR SAYI
    // Bir sayi söylüyoruz ve çıkan sonucu tahmin ediyoruz.
    // ipucu: sonuc her zaman 11 cıkıyor.
    // kullanıcıdan alınan sayının sonucu tahmin etmek
    // adım1: 1-100 arasında bir sayı olsun
    // adım1: Bu sayiyi 2 ile çarpın
    // adım2: sonuca 22 ekleyin
    // adım3: cikan sonucu 2 ile bolelim
    // adım4: ilk sayidan çıkarın bu sayiyi

    // Kullanıcı tarafından girilen haftanın gününü bulan algoritma
    // 1=pazartesi 2=salı ... 7=Pazar (switch-case)


    public static void main(String[] args) {
        // Örnek: 1-9 arasında 5 tane random sayı üretelim ve bunları toplayalım?
        // initial data sıfır toplamada etkisiz eleman
        // for , sum=0
        Random random=new Random();
        int sum=0;
        int number;
        String randomNumber="";
        for (int i = 0; i <5 ; i++) {
            number= random.nextInt(9)+1;
            randomNumber+=number+" ";
            sum+=number;
        }
        System.out.println(randomNumber);
        System.out.println(sum);



        // Örnek-3 (anlamak)
        // girilen karakter harf mi , sayı mı , özel simge mi ?
        // Character.isDigit => SAYI
        // Character.isLetter => HARF
        Scanner scanner=new Scanner(System.in);
        /*while(true){}
        for(;;){}*/
        while(true){
            System.out.println("\nLütfen bir simge giriniz");
            char data=scanner.nextLine().charAt(0);
            if(Character.isDigit(data)){
                System.out.println("Bu bir sayıdır");
            } else if(Character.isLetter(data)){
                System.out.println("Bu bir harftir");
            } else{
                System.out.println("Özel simge");
            }
        }
    }

    //ÖDEV
    // Vize Final Ödevi
    // kullanıcıdan alınan vize ve final notuna göre geçme(ortalama) Algoritması
    // eğer kullanıcı vize veya final 0(sıfır) bir değer girerse sistemden atsın
    // ekranda "Sifir disiplin hatasi Sistemden cikiliyor"
    // bunun haricinde sürekli vize final sorsun
    // Not Harfleri ==> AA BA BB FF
    // not ortalaması: ortalama<50 altında ise kaldı FF
    // not ortalaması: ortalama==50 Geçti
    // not ortalaması: 55<=x<=69 BB
    // not ortalaması: 70<=x<=84 BA
    // not ortalaması: 85<=x<=100 AA
    // Vize:40% Final:60%
    // Dikkat: Consolda virgül kullanmalısın.
    // while sonsuz döngü   ==> while(true) {}
    // for sonsuz döngü     ==> for(;;) {}

    // ÖDEV
    // kullanıcıdan aldığımız isim soyisim (boşluk var)
    // ilk karakter göstersin sonraki kelimeleri masking (maskeleme yapsın)
    // eğer kullanıcı isim ve soyisimi ilk karakteri küçük girmişse büyük olsun mutlaka
    // Hamit Mızrak// H**** MIZ***
    // ipucu: charAt, substring, indexOf, döngü, karar mekanizma


    // ÖDEV
    // Kullanıcı tarafından alınan bir sayıya göre ceza kesilecektir.
    // Hızı:79 kadar ise para cezası  : 0 TL      ==>  1<=speed<=79
    // Hızı:80 ise para cezası : 800 TL hızlısınız   ==>  80<=speed<=94
    // Hızı:95 ise para cezası : 1200 TL çok hızlısınız   ==>  95<=speed<=119//
    // Hızı:120 ise para cezası: 2000 TL  tehlikeli hızlısınız ==>  speed>=120//
    // Soför kaç kere trafik cezası yediğini ve toplam para cezasını//
    // ve eğer toplam ceza sayısı 5 ve üstüne ise ehliyetine el konulsun  hesaplayan algoritma yazalım ?

}
