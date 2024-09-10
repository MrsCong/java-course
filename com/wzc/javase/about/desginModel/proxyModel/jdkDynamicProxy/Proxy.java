package com.wzc.javase.about.desginModel.proxyModel.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//必须实现InvocationHandler，完成代理类做的功能
public class Proxy implements InvocationHandler {

    private Object target = null;

    public Proxy(Object target) {
        this.target = target;
    }

    public Object getProxyObj() {
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("doSomeThing before");
        //执行目标类的方法
        method.invoke(target,args);
        System.out.println("doSomeThing after");
        return null;
    }
}
