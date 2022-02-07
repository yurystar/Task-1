package com.senla.producerconsumer;

import java.util.Queue;

public class Consumer implements Runnable {
    private final Queue<Double> bufferQueue;

    public Consumer(Queue<Double> sharedQueue) {
        this.bufferQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumed: " + consume());
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private Double consume() throws InterruptedException {
        synchronized (bufferQueue) {
            if (bufferQueue.isEmpty()) {
                bufferQueue.wait();
            }

            bufferQueue.notifyAll();
            return bufferQueue.poll();
        }
    }
}
