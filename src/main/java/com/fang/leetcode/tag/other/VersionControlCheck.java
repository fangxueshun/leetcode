package com.fang.leetcode.tag.other;

/**
 * Author: fangxueshun
 * Description:
 * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 * <p>
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 * <p>
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 * <p>
 * 示例:
 * <p>
 * 给定 n = 5，并且 version = 4 是第一个错误的版本。
 * <p>
 * 调用 isBadVersion(3) -> false
 * 调用 isBadVersion(5) -> true
 * 调用 isBadVersion(4) -> true
 * <p>
 * 所以，4 是第一个错误的版本。
 * Date: 2018/9/17
 * Time: 23:01
 */
public class VersionControlCheck {

    /**
     * 要至少有一个错误的版本
     *折半查找
     * @param n
     * @return
     */
    public static int firstBadVersion(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return isBadVersion(1) ? 1 : 2;
        }
        int curl = (n / 2)+1;
        int lastMin = 0;
        int lastMax = n;
        while (curl > 0 & curl <= n) {

            if (curl == 1 || curl == n) {
                return curl;
            }
            if (isBadVersion(curl)) {
                lastMax = curl;
                if (!isBadVersion(curl - 1)) {
                    return curl;
                }
                curl = (curl / 2)+(lastMin / 2)+1;

            }
            else {
                lastMin = curl;
                if (isBadVersion(curl + 1)) {
                    return curl + 1;
                }
                //url+n 会有溢出的可能

                curl = (curl/2) + (lastMax/2) +1;
            }
            if (curl == 2) {
                return isBadVersion(1) ? 1 : 2;
            }
        }
        return 0;
    }

    /**
     * 优化的折半查找
     * @param n
     * @return
     */
    public static int firstBadVersionOptimized(int n){
        int left = 1;
        int right = n;
        while (right > left){
            //防止溢出
            int middle =  right +(left - right)/2;
            if(isBadVersion(middle)){
                right = middle;
            }
            else {
                //这一步是精髓，当前版本不是问题版本，可以直接跨过，因为找的是第一个出问题的版本
                left = middle+1;
            }
        }

        return right;
    }

    private static boolean isBadVersion(int version) {
        if (version >= 4) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(1 / 2);
    }
}
