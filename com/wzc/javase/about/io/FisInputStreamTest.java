package com.wzc.javase.about.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FisInputStreamTest {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\test\\aaa.txt");
            FileOutputStream fos = new FileOutputStream("E:\\test\\bbb.txt");
            byte[] b = new byte[1024];
            while (-1 != fis.read(b,0,b.length)) {
                fos.write(b);
            }
            System.out.println("加载完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
