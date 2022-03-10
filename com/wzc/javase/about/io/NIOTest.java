package com.wzc.javase.about.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class NIOTest {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\test\\aaa.txt");
            FileOutputStream fos  = new FileOutputStream("E:\\test\\eee.txt");
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            FileChannel fisChannel = fis.getChannel();
            FileChannel fosChannel = fos.getChannel();
            while (-1 != fisChannel.read(byteBuffer)) {
                byteBuffer.flip();
                fosChannel.write(byteBuffer);
                byteBuffer.clear();
            }
            fisChannel.close();
            fosChannel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
