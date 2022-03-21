package com.wzc.javase.about.desginModel.proxyModel;

public class Proxy implements CommonMethod {

    private CommonMethod commonMethod;

    public Proxy(CommonMethod commonMethod) {
        this.commonMethod = commonMethod;
    }

    @Override
    public void method1() {
        before();
        commonMethod.method1();
        after();
    }

    @Override
    public void method2() {
        before();
        commonMethod.method2();
        after();
    }

    private void before() {
        System.out.println("do SomeThing before");
    }

    private void after() {
        System.out.println("do SomeThing after");
    }


}
