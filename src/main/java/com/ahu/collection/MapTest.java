package com.ahu.collection;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

/**
 * @author ahufxf
 * @create 2021-10-05 22:23
 */
public class MapTest {

    @Test
    public void test1() throws Exception {
        Class aClass = Class.forName("java.util.Collection");
        Class aClass2 = Class.forName("java.lang.Object");
       // System.out.println(aClass.getMethods().length);
       // System.out.println(aClass2.getMethods().length);
        Method[] methods = aClass.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
    }
}
