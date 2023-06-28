package com.hspedu;

public class SellTicket {
    public static void main(String[] args) {

        SellThicket02 sellThicket02 = new SellThicket02();
        new Thread(sellThicket02).start();
        new Thread(sellThicket02).start();
        new Thread(sellThicket02).start();


    }
}
class SellTicket01 extends  Thread {
    private  static   int ticketNum = 100;

    @Override
    public void run() {
        while (true) {

        if (ticketNum <= 0) {
            System.out.println("售票结束。。。");
            break;
          }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票"
             + "剩余票数=" +(--ticketNum));
        }
    }
}
class SellThicket02 implements Runnable {
    private    int ticketNum = 100;

    @Override
    public void run() {
        while (true) {

            if (ticketNum <= 0) {
                System.out.println("售票结束。。。");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票"
                    + "剩余票数=" +(--ticketNum));
        }
    }
}

