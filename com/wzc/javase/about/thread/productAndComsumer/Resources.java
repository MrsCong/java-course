package com.wzc.javase.about.thread.productAndComsumer;

import sun.nio.ch.ThreadPool;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Resources {

    private int[] num = new int[5];
    private int count = 0;

    synchronized public void consumer() {
            try {
            if (0==count){
                this.wait();
            }else {
                if (count == 5) {
                    this.notify();
                }
                count--;
                System.out.println("消费了：" + num[count]);
                num[count] = 0;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void product() {
        try {
            if (count == 5) {
                this.wait();
            }else {
                if (count == 0) {
                    this.notify();
                }
                num[count] = new Random().nextInt(5) + 1;
                System.out.println("生产了："+num[count]);
                count++;
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
