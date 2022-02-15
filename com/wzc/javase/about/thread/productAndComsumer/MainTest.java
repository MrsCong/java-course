package com.wzc.javase.about.thread.productAndComsumer;

public class MainTest {

    public static void main(String[] args) {
        Resources resources = new Resources();
        ConsumerThread consumerThread = new ConsumerThread(resources);
        ProductThread productThread = new ProductThread(resources);
        consumerThread.start();
        productThread.start();
    }

}
