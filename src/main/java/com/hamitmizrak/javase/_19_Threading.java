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
                Thread.sleep(1000);
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
        thread1.start();
        thread2.start();

        //join: öncelikle 1 ve2 bitsin
        thread1.join();
        thread2.join();

        thread3.start();
    }
}

// arayüz (interface)
@Getter @Setter
 class ThreadingInterface implements Runnable{

    private String threadName;

    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i+" ");
        }
    }
}
