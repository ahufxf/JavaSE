package com.ahu.proxy;

import java.lang.reflect.Proxy;

/**
 * @author ahufxf
 * @create 2021-10-04 01:40
 */
public class MyTest {
    public static void main(String[] args) {

        TargetProxy targetProxy = new TargetProxy();

        Class clazz = targetProxy.getClass();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(targetProxy);

        ProxyInterface my = (ProxyInterface) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), myInvocationHandler);

        my.method1();
        my.method2(2);
    }
}
