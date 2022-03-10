package com.wzc.javase.about.thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyFixThreadPool {
    ExecutorService fixedThreadPool = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) {

    }
}
