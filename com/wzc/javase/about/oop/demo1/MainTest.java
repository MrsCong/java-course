package com.wzc.javase.about.oop.demo1;

public class MainTest {
    public static void main(String[] args) {
        Person person = new Person();
        for (int i = 0;i<1000;i++) {
            person = null;
        }
        System.gc();
    }

    static class Person {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("我该回收了~");
            super.finalize();
        }
    }
}
