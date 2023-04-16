package com.hamitmizrak.javase;

import lombok.Getter;
import lombok.Setter;

// arayüz (interface)
@Getter
@Setter
public class _19_Threading2 implements Runnable {

    private String threadName;

    public _19_Threading2(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(threadName+" ==> "+i+" ");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new _19_Threading2("1.thread ==>"));
        Thread thread2 = new Thread(new _19_Threading2("2.thread ==>"));
        Thread thread3 = new Thread(new _19_Threading2("3.thread ==>"));

        thread1.start();
        thread2.start();
        //Join
        thread1.join();
        thread2.join();

        thread3.start();
    }
}
