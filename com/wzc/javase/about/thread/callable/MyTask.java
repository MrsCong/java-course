package com.wzc.javase.about.thread.callable;

import java.util.concurrent.Callable;

public class MyTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Task start");
        return "Finish";
    }
}
