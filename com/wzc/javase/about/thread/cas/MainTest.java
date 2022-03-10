package com.wzc.javase.about.thread.cas;

import com.sun.deploy.util.SyncAccess;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

public class MainTest {

    private static int count = 0;
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();
        for (int i =0;i<2;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<100;i++) {
                        synchronized (MainTest.class) {
                            count++;
                        }
                    }
                }
            }).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }

}
