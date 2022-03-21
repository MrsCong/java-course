package com.wzc.javase.about.desginModel.proxyModel;

public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new SubJect());
        proxy.method1();
        proxy.method2();
    }
}
