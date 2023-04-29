package com.hamitmizrak.javase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



// OOP common information()
// Override
// inheritance
// super keyword
// polymorphism
// abstract
// interface
// generics
// Collection(Data Structes)

// MVC nedir : Model:Java View:Html Controller=Model ile View arasında köprüdür.  ?

// new: hafızada benim için git yer aç (olmayan bir şeyi yapmak içindir) (DOĞAR)
// null: olan bir şeyi kaybeder(ÖLÜR)
// zero: sıfır zero ile null aynı şey değildir
// 0 ile null aynı değildir.

// LOMBOK
@Data
//@AllArgsConstructor
@NoArgsConstructor
@Builder
public class _23_Class4 {
    private String name;
    private String surname;
    private String email;
    private String address;

    // static: new olmaz , CLASSADI:DEGISKENADI
    private static String CITY="MALATYA"; // Class değişkeni // static

    // const: sabit ve değizmez ve her yerden erişim vardır.
    private static final int SABIT_DEGISKEN=25; // final // finally

    // final:
    // 1-) field final: sabit değişkende olur
    // 2-) class final: o class extends edemem.
    // 3-) method final: o metotu override edemezsiniz.

    // final ile finally aynı şey değil:
    // finally: exception kullanıyoruz.

    public _23_Class4(String name, String surname, String email, String address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }

    // PSVM
    public static void main(String[] args) {

       //instance(new) ==> 1
        // instance
        _23_Class4 person1=new _23_Class4();
        person1.setName("Adı1");
        person1.setSurname("Soyadı1");
        person1.setEmail("Email1");
        person1.setAddress("Address1");
        System.out.println(person1);
        System.out.println("***************************");

        //instance(new) ==> 2
        _23_Class4 person2=new _23_Class4("Adı2","Soyadı2","Email2","Address2");
        System.out.println(person2);

        System.out.println("***************************");

        //instance(new) ==> 23
        _23_Class4 person3=_23_Class4
                .builder()
                .name("Adı3")
                .surname("Soyadı3")
                .email("Email3")
                .address("Address3")
                .build();
        System.out.println(person3);
        System.out.println(_23_Class4.CITY);
        // Javanın önemli kütüphanesi: java.lang'dir
        Object deneme=new Object();
    }
}
