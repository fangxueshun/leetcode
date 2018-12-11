package com.fang.leetcode.tag.generic;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/11/12
 * Time: 21:59
 */
public class Dog<T> implements Animal<T> {
    @Override
    public void eat() {
        System.out.println("狗类动物吃东西，yummy~~~");
    }
}
