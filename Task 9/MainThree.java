package com.senla.producerconsumer;

import java.util.LinkedList;

public class MainThree {

    public static void main(String[] args) {

        LinkedList<Double> bufferQueue = new LinkedList<>();
        int size = 4;
        Thread prodThread = new Thread(new Producer(bufferQueue, size), "Producer");
        Thread consThread = new Thread(new Consumer(bufferQueue), "Consumer");
        prodThread.start();
        consThread.start();
    }
}
