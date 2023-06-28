package com.hspedu.threaduse;

public class Thread02 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();



    }
}
class Animal{ }
class Tiger extends Animal implements  Runnable {

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫。。。");
    }
}
class ThreadProxy implements  Runnable {
    private  Runnable target = null;



    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
    public ThreadProxy(Runnable target) {
        this.target = target;
    }
    public  void  start() {
        start0();
    }
    public  void  start0() {
        run();
    }
}
class Dog implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫。。hi" + (++count) + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}
