package com.fang.leetcode.tag.other;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: fangxueshun
 * Description:
 * <p>
 * 统计所有小于非负整数 n 的质数的数量。
 * <p>
 * 示例:
 * <p>
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * Date: 2018/10/2
 * Time: 23:04
 */
public class CountPrimes {
    /**
     * 依次判断每个数是否为素数
     * 若h为素数则h*k(<0k<n/k）不为素数
     * @param n
     * @return
     */
    public static int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        int count = 0;
        int[] primes = new int[n / 2];
        for (int i = 3; i < n; i += 2) {
            // 只判断奇数是不是素数
            boolean isPrime = true;
            for (int j = 0; j < count && primes[j] * primes[j] <= i; j++) {
                // 只试除素数
                if (i % primes[j] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[count++] = i;
            }
        }
        return count + 1;// 2
    }

    /**
     * 剔除2~Math.sqrt(n)的数
     * @param n
     * @return
     */
    public static int countPrimesAnothrer(int n) {
        if (n <= 2) {
            return 0;
        }

        Set<Integer> noPrimeNumber = new HashSet<>();
        noPrimeNumber.add(1);
        for (int i = 2; i < Math.sqrt(n); i++) {
            for(int j = 2;j<n;j++){
                if(i*j>=n){
                    break;
                }
                noPrimeNumber.add(i*j);
            }
        }
        return n-noPrimeNumber.size()-1;
    }

    /**
     * 判断一个数是否为素数
     * 1不为素数，2为素数，其他数如果能被2~Math.sqrt(n)之间的整数整除，则不为素数
     *定理：任何合数均可以写成两个素的的乘积，而该素数必定为一大一小或者两个相等，所以，判断小的一半即可
     * @param n
     * @return
     */
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
