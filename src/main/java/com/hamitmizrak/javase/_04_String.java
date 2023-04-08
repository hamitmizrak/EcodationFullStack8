package com.hamitmizrak.javase;

public class _04_String {
    // String nedir ?
    // StringBuilder StringTokenize


    public static void main(String[] args) {
        String vocabulary="Java öğreniyorum Java ";
        System.out.println(vocabulary);
        System.out.println(vocabulary.length());
        System.out.println(vocabulary.trim().length());
        System.out.println(vocabulary.toLowerCase());
        System.out.println(vocabulary.toUpperCase());
        System.out.println(vocabulary.startsWith("J"));
        System.out.println(vocabulary.endsWith(" "));

        System.out.println(vocabulary.indexOf("Java"));
        System.out.println(vocabulary.lastIndexOf("Java"));
        System.out.println(vocabulary.charAt(2)); // 1<=X<=3-1

        System.out.println(vocabulary.substring(1));
        System.out.println(vocabulary.substring(1,3)); // 1<=X<=3-1

        System.out.println(vocabulary.concat("x1").concat("x2"));
        System.out.println(vocabulary.replace(vocabulary,"yeni"));

        // ÖDEV
        // Ödev: Kullanıcıdan aldığınız isim ve soyismin; (isimi: scanner ve soyismi: jOptionalPane)
        // bu kelimenin harf sayısı ? [ ipucu: length() ]
        // bu kelimenin bütün karakteri büyük yapalım ? [ ipucu: toUpperCase()]
        // bu kelimenin bütün karakteri küçük yapalım ? [ ipucu: toLowerCase()]
        // bu kelimenin başında ve sonunda boşlukları alalım ? [ ipucu: trim()]
        // bu kelimenin j ile başlıyoru mu ?   [ ipucu: startsWith("j")]
        // bu kelimenin a ile biter mi ?   [ ipucu:  endsWith("a")]
        // bu kelimenin ilk harfi ? [ ipucu: charAt(0)]
        // bu kelimenin içinde baştan Altan geçiyor mu ? [ ipucu: indexOf("java")]
        // bu kelimenin içinde sondan Berkan geçiyor mu ? [ ipucu: lastIndexOf("java")]
        // bu kelimenin 4.harften sonra gösterilsin ? [ ipucu: substring(4)]
        // bu kelimenin sonuna INC ekleyelim  ? [ ipucu: concat(".INC")]
        // bu kelimenin içerisinde java44 geçiyor mu ? [ ipucu: contains("java44")]
        // bu kelimenin "deneme" ile aynı mı ?  [ipucu: ipucu: equals("deneme");]

    }
}
