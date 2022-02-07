package com.senla.systemtime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SystemTimeThread implements Runnable {
    int waitingTime;
    static Lock lock = new ReentrantLock();

    public SystemTimeThread(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    @Override
    public void run() {
        for ( ; ; ) {
            try {
                Thread.sleep(waitingTime);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            lock.lock();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            System.out.println(formatter.format(date));
            lock.unlock();
        }
    }
}
