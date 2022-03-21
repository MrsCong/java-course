package com.wzc.javase.about.desginModel.proxyModel.jdkDynamicProxy;

public class MainTest {

    public static void main(String[] args) {
        //创建代理对象，使用Proxy
        //1.创建目标对象
        Father obj = new Son();
        Proxy proxy = new Proxy(obj);
        Father proxyObj = (Father) proxy.getProxyObj();
        proxyObj.run();
    }
}
