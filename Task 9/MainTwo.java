package com.senla.showthreadname;

public class MainTwo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("First");
        t2.setName("Second");

        t1.start();
        t2.start();
    }
}
