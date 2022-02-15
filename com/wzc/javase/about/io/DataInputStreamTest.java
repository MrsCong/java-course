package com.wzc.javase.about.io;

import java.io.*;

public class DataInputStreamTest {

    public static void main(String[] args) {
//        int m = 200;
//        try {
            File file = new File("E:\\test\\ccc.txt");
//            FileOutputStream fos = new FileOutputStream(file);
//            DataOutputStream dos = new DataOutputStream(fos);
//            dos.writeInt(m);
//            dos.flush();
//            dos.close();
//            fos.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            int n = dis.readInt();
            System.out.println(n);
            dis.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
