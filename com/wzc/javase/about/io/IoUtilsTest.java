package com.wzc.javase.about.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IoUtilsTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("E:\\test","aaa.txt");
        Path p2 = Paths.get("E:\\test","fff.txt");
        try {
            Files.move(p1,p2,StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
