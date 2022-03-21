package com.wzc.javase.about.desginModel.proxyModel.cglibDynamicProxy;

import com.wzc.javase.about.desginModel.proxyModel.CommonMethod;
import net.sf.cglib.Enhancer;
import net.sf.cglib.MethodInterceptor;
import net.sf.cglib.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Enhancer.enhance(target.getClass(),this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        methodProxy.invokeSuper(o,objects);
        after();
        return null;
    }
    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}
