package com.wzc.javase.about.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/5/29 15:45
 */
public class VolatileTest {

    private final Object lock = new Object();

    public void test() throws InterruptedException {
        synchronized (lock) {
            System.out.println("wait before");
            lock.wait();
            System.out.println("wait after");
        }
    }

    public void wake() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("000");
        lock.notifyAll();
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileTest volatileTest = new VolatileTest();
        volatileTest.test();
        volatileTest.wake();

//        new Thread(() -> {
//            while (flag) {
//                System.out.println("running1:" + flag);
//            }
//        }).start();
//        new Thread(() -> {
//            while (flag) {
//                System.out.println("running2:" + flag);
//            }
//        }).start();
//        new Thread(() -> {
//            while (flag) {
//                System.out.println("running3:" + flag);
//            }
//        }).start();
//        new Thread(() -> {
//            while (flag) {
//                try {
//                    TimeUnit.SECONDS.sleep(2);
//                    flag = false;
//                    System.out.println("已结束");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
    }

}