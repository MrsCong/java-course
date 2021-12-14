package com.wzc.javase.about.NewKeWang.test2;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 */
public class MainTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(Integer.parseInt(str.substring(2),16));
        }
    }
}
