package com.wzc.javase.about.desginModel.proxyModel;

/**
 *  代理模式定义：为其他对象提供一种代理以控制对这个对象的访问
 */
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new SubJect());
        proxy.method1();
        proxy.method2();
    }
}
