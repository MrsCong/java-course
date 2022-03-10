package com.wzc.javase.about.thread;

public class DeathLockDemo {

    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        //线程A，按照先锁a再获得锁b的顺序获得锁
        new Thread() {
            @Override
            public void run() {
                synchronized (a) {
                    System.out.println(Thread.currentThread().getName() + "线程 以获取a资源");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "线程 想获取b资源");
                    synchronized (b) {
                        System.out.println(Thread.currentThread().getName() + "win");
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                synchronized (b) {
                    System.out.println(Thread.currentThread().getName() + "线程 以获取b资源");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "线程 想获取a资源");
                    synchronized (a) {
                        System.out.println(Thread.currentThread().getName() + "win");
                    }
                }
            }
        }.start();

    }

}
