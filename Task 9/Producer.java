package com.senla.producerconsumer;

import java.util.Queue;

public class Producer implements Runnable {

    private final Queue<Double> bufferQueue;
    private final int SIZE;

    public Producer(Queue<Double> sharedQueue, int size) {
        this.bufferQueue = sharedQueue;
        this.SIZE = size;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Produced: " + produce());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private double produce() throws InterruptedException {
        synchronized (bufferQueue) {
            if (bufferQueue.size() == SIZE) {
                bufferQueue.wait();
            }

            double newValue = Math.random();
            bufferQueue.add(newValue);
            bufferQueue.notifyAll();
            return newValue;
        }
    }
}
