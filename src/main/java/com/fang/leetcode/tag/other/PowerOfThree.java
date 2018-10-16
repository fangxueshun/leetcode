package com.fang.leetcode.tag.other;

/**
 * Author: fangxueshun
 * Description:
 *
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 *示例 1:
 *
 * 输入: 27
 * 输出: true
 * 示例 2:
 *
 * 输入: 0
 * 输出: false
 *
 * Date: 2018/10/16
 * Time: 23:36
 */
public class PowerOfThree {

    /**
     *通过进制准换的思想来解题
     * @param n
     * @return
     */
    public static boolean isPowerOfThreeByLoop(int n) {
        if(n == 1){
            return true;
        }
        if(n<3){
            return false;
        }
        while (n!=0){
            int remainder =  n%3;
            n = n/3;
            if(remainder !=0 && (remainder!=1 || n!=0)){
                return false;
            }
        }


        return true;
    }

    /**
     * 二进制判断
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        return (n>0) && ((n&(n-1)) == 0);
    }

    /*时间最短的算法*/
    public static boolean isPowerOfThree(int n) {
        //最大的3的幂指数对应的指数
        //int k = (int)(Math.log(Integer.MAX_VALUE)/Math.log(3));//换底公式
        //转换为10进制
        //求出对应的值为1162261467
        //int maxValue = (int)Math.pow(3,k);

        return n >0 && 1162261467%n==0;
    }

    //计算整数范围内最大的3的整数幂对应的整数
    public static void main(String[] args) {

        //最大的3的幂指数对应的指数
        int k = (int)(Math.log(Integer.MAX_VALUE)/Math.log(3));//换底公式
        //转换为10进制
        //求出对应的值为1162261467
        System.out.println((int)Math.pow(3,k));
    }
}
