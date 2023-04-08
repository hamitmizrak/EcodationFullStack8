package com.hamitmizrak.javase;

public class _07_Conditional {

    // debug nedir ? intellij idea

    public static void main(String[] args) {
        // Conditional (if-else)
        int number=5;
        if(number==1){
            System.out.println("1");
        }else if(number==2){
            System.out.println("2");
        }else if(number==3){
            System.out.println("3");
        }else if(number==4){
            System.out.println("4");
        }else if(number==5){
            System.out.println("5");
        }else{
            System.out.println("1<=X<=5 dışında");
        }
        System.out.println("");

        //switch-case
        switch (number){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 5:
                System.out.println("5");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("1<=X<=5 dışında");
                break;
        }
    }
}
