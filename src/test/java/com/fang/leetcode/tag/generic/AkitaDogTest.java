package com.fang.leetcode.tag.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import static org.junit.Assert.*;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/11/12
 * Time: 22:06
 */
public class AkitaDogTest {

    @Test
    public void akitaMethod() {
//        List<Animal> animals = new ArrayList<>();
//        List<PersianCat> persianCats = new ArrayList<>();
//        List<Cat> cats = new ArrayList<>();
//        List l = new ArrayList();
//        List<? extends Cat> list = new ArrayList();
//        List<? super Cat> listSupper = new ArrayList();
//        List<?> listN = new ArrayList();
//
//        list = animals;
//        list = persianCats;
//        list = cats;
//
//        listSupper = animals;
//        listSupper = cats;
//        listSupper = persianCats;
//
//        listN = animals;
//        listN = cats;
//        listN = persianCats;
////        list.add(new PersianCat());
//
//        list.add(new Object());
//        list.add(new Animal());
//        list.add(new Cat());
//        list.add(new PersianCat());
//
//        listSupper.add(new Object());
//        listSupper.add(new Animal());
//        listSupper.add(new Cat());
//        listSupper.add(new PersianCat());
//
//
//        listN.add(new Object());
//        listN.add(new Animal());
//        listN.add(new Cat());
//        listN.add(new PersianCat());
//
//
//       Cat a =  list.get(0);
//       Animal b =  list.get(0);
//        a = listSupper.get(0);
//        a = listN.get(0);
//        list.addAll()
//        list = listSupper;
//
//        listN = l;
//        listSupper = l;
//        list=l;
//        animals = l;
        int[] a = {1, 2};
        int[] b = a;
        b[1] = 5;
        System.out.println(a[1]);


    }
}