package com.wzc.javase.about.thread.productAndComsumer;

public class ProductThread extends Thread {

    private Resources resources;

    public ProductThread(Resources resources) {
        this.resources = resources;
    }

    public void run() {
        while (true) {
            try {
                resources.product();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
