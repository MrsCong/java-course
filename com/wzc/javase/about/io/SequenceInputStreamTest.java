package com.wzc.javase.about.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamTest {

    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("E:\\test\\aaa.txt");
            FileInputStream fis2 = new FileInputStream("E:\\test\\bbb.txt");
            //队列流
            SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
            byte[] bs = new byte[4];
            int len = -1;
            while ((len = sis.read(bs)) != -1) {
                System.out.write(bs,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
