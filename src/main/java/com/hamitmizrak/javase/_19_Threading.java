package com.hamitmizrak.javase;


// Thread
// kalıtım yoluyla
public class _19_Threading extends Thread{
    private String threadName;

    public _19_Threading(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public String toString() {
        return "_19_Threading{" +
                "threadName='" + threadName + '\'' +
                "} " + super.toString();
    }

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

    public static void main(String[] args) {
        _19_Threading thread1=new _19_Threading("1.thread ==>");
        _19_Threading thread2=new _19_Threading("2.thread ==>");
        _19_Threading thread3=new _19_Threading("2.thread ==>");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

// arayüz (interface)
 class ThreadingInterface implements Runnable{

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
