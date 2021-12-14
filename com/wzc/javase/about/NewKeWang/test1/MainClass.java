package com.wzc.javase.about.NewKeWang.test1;
import java.util.Scanner;

public class MainClass {
    /**
     * 描述
     * •连续输入字符串，请按长度为8拆分每个输入字符串并进行输出；
     * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
     * （注：本题有多组输入）
     * 输入描述：
     * 连续输入字符串(输入多次,每个字符串长度小于等于100)
     * 输出描述：
     * 依次输出所有分割后的长度为8的新字符串
     * 示例1
     * 输入：
     * abc
     * 123456789
     * 复制
     * 输出：
     * abc00000
     * 12345678
     * 90000000
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuilder tempStr = new StringBuilder(str);
            while (tempStr.length() > 8) {
                System.out.println(tempStr.substring(0,8));
                tempStr.delete(0,8);
            }
            int len = tempStr.length();
            if (0<len && len < 8) {
                for (int i = 0;i<=8-len;i++) {
                    tempStr.append("0");
                }
                System.out.println(tempStr);
            }
        }

    }
}
