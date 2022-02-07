package com.senla.systemtime;

public class MainFour {

    public static void main(String[] args) {

        Thread timeThread = new Thread(new SystemTimeThread(1000));
        timeThread.start();
    }
}
