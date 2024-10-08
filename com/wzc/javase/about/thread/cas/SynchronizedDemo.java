package com.wzc.javase.about.thread.cas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

public class SynchronizedDemo {

    public synchronized void test() {
        System.out.println("Hello world");
    }

    public void newTest() {
        synchronized (this) {
            System.out.println("Well done");
        }
    }

    public static void main(String[] args) {

    }

}
