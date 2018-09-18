package com.fang.leetcode.tag.other;

/**
 * Author: fangxueshun
 * Description:
 *
 *
 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

 注意：给定 n 是一个正整数。

 示例 1：

 输入： 2
 输出： 2
 解释： 有两种方法可以爬到楼顶。
 1.  1 阶 + 1 阶
 2.  2 阶
 示例 2：

 输入： 3
 输出： 3
 解释： 有三种方法可以爬到楼顶。
 1.  1 阶 + 1 阶 + 1 阶
 2.  1 阶 + 2 阶
 3.  2 阶 + 1 阶
 * Date: 2018/9/18
 * Time: 23:25
 */
public class ClimbStairs {

    /**
     * f(n)={
     *     1 (n=1)
     *     2 (n = 2)
     *     f(n-1)+f(n-2) (n>2)
     * }
     * 对于第三种情况的证明，可以这样理解，当n层台阶时，可以在（n-1）上的基础上，再上一阶，加上在（n-2）的基础数加两阶
     * 时间复杂度O(n2)
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }

    /**
     * 上个递归解法的变形，保存了每层台阶的解，时间复杂度O(n),空间复杂度O(n);
     * @param n
     * @return
     */
    public static int climbStairsByLoop(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int[] result = new int[n-1];
        result[0]=1;
        result[1]=2;
        for(int i=2;i<n-1;i++){
            result[i] = result[i-1]+result[i-2];
        }
        return result[n-2]+result[n-3];
    }
}
