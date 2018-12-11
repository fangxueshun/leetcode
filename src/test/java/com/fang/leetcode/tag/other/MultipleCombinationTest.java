package com.fang.leetcode.tag.other;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/10/18
 * Time: 23:12
 */
public class MultipleCombinationTest {

    /**
     * 布隆过滤器测试
     */
    @Test
    public void boomFilterTest(){
        long star = System.currentTimeMillis();
        int capty = 10000;
        BloomFilter<Integer> bloomFilter = new BloomFilter(100000) ;
        for (int i = 0; i < capty; i++) {
            bloomFilter.add(i) ;
        }
        Assert.assertTrue(bloomFilter.isExit(1));
        Assert.assertTrue(bloomFilter.isExit(2));
        Assert.assertTrue(bloomFilter.isExit(3));
        Assert.assertFalse(bloomFilter.isExit(100000003));
        Assert.assertFalse(bloomFilter.isExit(100000004));
        Assert.assertFalse(bloomFilter.isExit(100000005));

        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - star));

    }

    @Test
    public void bitMapTest(){
        int [] array = new int [] {1,2,3,22,0,3,63};
        BitSet bitSet  = new BitSet(1);
        System.out.println(bitSet.size());   //64
        bitSet  = new BitSet(65);
        System.out.println(bitSet.size());   //128
        bitSet  = new BitSet(23);
        System.out.println(bitSet.size());   //64

        //将数组内容组bitmap
        for(int i=0;i<array.length;i++)
        {
            bitSet.set(array[i], true);
        }

        System.out.println(bitSet.get(22));
        System.out.println(bitSet.get(60));

        System.out.println("下面开始遍历BitSet：");
        for ( int i = 0; i < bitSet.size(); i++ ){
            System.out.println(bitSet.get(i));
        }
    }


    @Test
    public void singleSelectionComb() {
//        Assert.assertEquals(new String[]{"13","14","23","24"},MultipleCombination.singleSelectionComb(new String[]{"1","2"}
//        ,new String[]{"3","4"}));
        Map<String,String> map = new HashMap<>();
        map.hashCode();
        System.out.println(18>>1);
        System.out.println(17>>1);

        List<String> mastList = new ArrayList<>();
        mastList.add("one");
        mastList.add("two");
        mastList.add("three");
        mastList.add("four");
        mastList.add("five");

        List<String> subList = mastList.subList(0,3);
//        mastList.remove(0);
//        mastList.add("ten");
//        mastList.clear();

        subList.clear();
        subList.add("six");
        subList.add("seven");
        subList.remove(0);
        subList.forEach(s-> System.out.println(s));
        System.out.println("==============");
        mastList.forEach(s-> System.out.println(s));
    }
}