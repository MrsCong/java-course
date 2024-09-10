package com.wzc.javase.about.thread;

import java.util.Random;
import java.util.concurrent.locks.Lock;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/5/31 16:39
 */
public class ThreadDumpTest {

    public static void main(String[] args) {
        String str = "aa";
        while (true) {
            str = str + new Random(50000);
        }
    }

}