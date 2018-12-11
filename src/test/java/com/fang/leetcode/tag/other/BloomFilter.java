package com.fang.leetcode.tag.other;

import org.junit.Assert;

/**
 * Author: fangxueshun
 * Description:
 * 实现布隆过滤器
 * Date: 2018/11/29
 * Time: 22:08
 */
public class BloomFilter<T> {
    private int size;
    private int[] container;


    public BloomFilter(int size) {
        Assert.assertTrue("size must bigger than 0", size > 0);
        this.size = size;
        this.container = new int[size];
    }

    public void add(T t) {
        int hash = hashByIteration(t);
        int hasByXor = hashByXor(t);
        container[hash % size] = 1;
        container[hasByXor % size] = 1;
    }

    public boolean isExit(T t) {
        int hash = hashByIteration(t);
        int hasByXor = hashByXor(t);
        if (container[hash % size] != 1 || container[hasByXor % size] != 1) {
            return false;
        }
        return true;
    }

    public int hashByXor(T t) {
        int times = Math.abs(t.hashCode()) % 10;
        int hash, i;
        for (hash = 0, i = 0; i < times; ++i) {
            hash += t.hashCode();
            hash += (hash << 10);
            hash ^= (hash >> 6);
        }
        hash += (hash << 3)+t.hashCode();
        hash ^= (hash >> 11);
        hash += (hash << 15);
        return Math.abs(hash);


    }

    public int hashByIteration(T t) {
        final int p = 16777619 % (Math.abs(t.hashCode()) + 1);
        int hash = 216613626 + p;

        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;
        return Math.abs(hash);
    }
}
