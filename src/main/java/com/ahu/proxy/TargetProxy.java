package com.ahu.proxy;

/**
 * 这是我们的被代理类，代理类是动态生产的
 * @author ahufxf
 * @create 2021-10-04 01:32
 */
public class TargetProxy implements ProxyInterface {
    public void method1() {
        System.out.println("method1");
    }

    public String method2(int age) {
        System.out.println("method2");
        return "myProxyTest";
    }
}
