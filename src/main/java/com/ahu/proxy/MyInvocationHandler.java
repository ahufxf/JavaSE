package com.ahu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理第一步生成 InvocationHandler 的实现类
 * @author ahufxf
 * @create 2021-10-04 01:36
 */
public class MyInvocationHandler implements InvocationHandler{

    private Object targetObj;

    public MyInvocationHandler() {
    }

    public MyInvocationHandler(Object targetObj) {
        this.targetObj = targetObj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object invoke = method.invoke(targetObj, args);
        return invoke;
    }


}
