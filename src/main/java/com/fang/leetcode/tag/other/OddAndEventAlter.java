package com.fang.leetcode.tag.other;

import com.fang.leetcode.tag.tree.Symmetric;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: fangxueshun
 * Description:
 * 两个线程交替打印奇偶数，使用重入锁
 *
 * Date: 2018/11/27
 * Time: 23:41
 */
public class OddAndEventAlter {
    static  int start = 0;
    static Lock lock = new ReentrantLock(false);
    static volatile boolean isOddNumber = true;
    public static void main(String[] args) {
        Long a = 1L;
        Thread oddThread = new Thread(()-> {
            Long currentTime = System.currentTimeMillis();
            while (start <10000){
                try {
                    lock.lock();
                    if(isOddNumber){
                        System.out.println(Thread.currentThread().getName()+":"+ start);
                        start++;
                        isOddNumber=false;
                    }
                }finally {
                    lock.unlock();
                }
            }
            System.out.println("线程["+Thread.currentThread().getName()+"]耗时"+(System.currentTimeMillis()-currentTime)+"ms");
        });
        oddThread.setName("odd_thread");

        Thread eventThread = new Thread(()-> {
            Long currentTime = System.currentTimeMillis();
            while (start <10000){
                try {
                    lock.lock();
                    if(!isOddNumber){
                        System.out.println(Thread.currentThread().getName()+":"+ start);
                        start++;
                        isOddNumber=true;
                    }
                }finally {
                    lock.unlock();
                }

            }
            System.out.println("线程["+Thread.currentThread().getName()+"]耗时"+(System.currentTimeMillis()-currentTime)+"ms");
        });
        eventThread.setName("event_thread");

        eventThread.start();
        oddThread.start();


    }
}
