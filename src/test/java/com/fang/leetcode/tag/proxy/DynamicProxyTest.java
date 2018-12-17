package com.fang.leetcode.tag.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/12/17
 */
public class DynamicProxyTest {

    @Test
    public void bind() {
        MyRest myRest = new MyRest();
        DynamicProxy proxy = new DynamicProxy();
        RestInterface restInterface = proxy.bind(myRest);
        restInterface.readBook("金瓶梅");
        restInterface.shopping();
    }
}