package com.hamitmizrak.javase;

// Thread
// kalıtım yoluyla

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class _19_Threading extends Thread{
    private String threadName;

    public _19_Threading(String threadName) {
        this.threadName = threadName;
    }


    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            try {
                //1000ms=1sn
                Thread.sleep(1000);
                if(i==1){
                    System.out.println("\n### Başlangıç Thread###");
                    System.out.println(this.threadName+" ==> "+i+" ");
                }else if(i==10){
                    System.out.println("\n### Bitiş Thread###");
                    System.out.println(this.threadName+" ==> "+i+" ");
                }else{
                    System.out.println(this.threadName+" ==> "+i+" ");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(threadName+" ==> "+i+" ");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        _19_Threading thread1=new _19_Threading("1.thread ==>");
        _19_Threading thread2=new _19_Threading("2.thread ==>");
        _19_Threading thread3=new _19_Threading("3.thread ==>");

        //Thread  Genel Bilgileri
        System.out.println("Thread1: isAlive "+thread1.isAlive());
        thread1.start();
        System.out.println("Thread1: ID "+thread1.getId());
        System.out.println("Thread1: HashCode "+thread1.hashCode());
        System.out.println("Thread1: isAlive "+thread1.isAlive());
        System.out.println("Thread1: getName "+thread1.getName());
        thread1.setName("ThreadMalatya");
        System.out.println("Thread1: getName "+thread1.getName());


        //thread1.wait();//wait =>thread: durur
        //thread1.notify(); //notify =>thread: çalıştırır.
        //thread1.notifyAll(); //join: öncelikle 1 ve2 bitsin

        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();
    }
}

