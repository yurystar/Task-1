package com.senla.threadstates;

public class MainOne {

    public static void main(String[] args) {

        final Object s = new Object();

        Thread t1 = new Thread(
                () -> {
                    synchronized (s) {
                        try {
                            s.wait();
                            /* Для получения результата TIMED_WAITING нужно заменить на эту строку
                           s.wait(50);                                            */
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    for (int i = 0; i < 100; i++) {
                        System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
                    }
                }
        );
        System.out.println(t1.getState());

        Thread t2 = new Thread(
                () -> {

                    for (int i = 100; i < 200; i++) {
                        System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
                        if (i == 110) {
                            synchronized (s) {
                                s.notify();
                            }
                        }
                        System.out.println(t1.getState());
                    }
                }
        );

        t1.start();
        System.out.println(t1.getState());
        t2.start();
    }
}
