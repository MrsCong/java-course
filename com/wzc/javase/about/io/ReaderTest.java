package com.wzc.javase.about.io;

import java.io.*;

public class ReaderTest {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("E:\\test\\aaa.txt");
            FileWriter fw = new FileWriter("E:\\test\\ddd.txt");
            char[] b = new char[1024];
            while (-1 != fr.read(b,0,b.length)) {
                fw.write(b);
            }
            fr.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
