package com.wzc.javase.about.thread.productAndComsumer;

public class ConsumerThread extends Thread {
    private Resources resources;

    public ConsumerThread(Resources resources) {
        this.resources = resources;
    }

    public void run() {
        while (true) {
            try {
                resources.consumer();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
