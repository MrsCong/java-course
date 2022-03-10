package com.wzc.javase.about.thread.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MainTest {

    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        FutureTask<String> future = new FutureTask<>(myTask);
        try {
            new Thread(future).start();
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
