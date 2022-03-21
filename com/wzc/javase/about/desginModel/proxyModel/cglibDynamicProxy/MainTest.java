package com.wzc.javase.about.desginModel.proxyModel.cglibDynamicProxy;

import com.wzc.javase.about.desginModel.proxyModel.CommonMethod;
import com.wzc.javase.about.desginModel.proxyModel.SubJect;

public class MainTest {

    public static void main(String[] args) {
        CommonMethod commonMethod = new SubJect();
        CglibProxy cglibProxy = new CglibProxy(commonMethod);
        CommonMethod proxy = (CommonMethod) cglibProxy.getProxy();
        proxy.method1();
        proxy.method2();
    }
}
