package com.fang.leetcode.tag.generic;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/11/12
 * Time: 22:00
 */
public class Cat<T> implements Animal<T> {
    @Override
    public void eat() {
        System.out.println("猫类动物吃东西，yummy~~~");
    }
}
