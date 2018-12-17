package com.fang.leetcode.tag.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/12/17
 */
public class DynamicProxy implements InvocationHandler {

    public  RestInterface bind(Object object){
        return (RestInterface)Proxy.newProxyInstance(object.getClass().getClassLoader(),new Class[]{RestInterface.class},this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Long time = System.currentTimeMillis();
        Object target = method.invoke(proxy,args);
        System.out.println("方法："+method.getName()+" 执行共耗时"+(System.currentTimeMillis()-time)+"ms");
        return target;
    }
}
