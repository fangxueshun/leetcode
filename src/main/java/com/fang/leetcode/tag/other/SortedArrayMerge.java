package com.fang.leetcode.tag.other;

import java.util.Arrays;

/**
 * description
 * <p>
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * Java
 *
 * @author fangxueshun
 * @date 2018/9/17
 */
public class SortedArrayMerge {

    /**
     * 两个数组合并，调用双轴快排，效率比较低
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 0 || nums2.length == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);


    }

    /**
     *
     * 时间复杂度0n的解法
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void mergeByOneLoop(int[] nums1, int m, int[] nums2, int n) {
        int tailIndex = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[tailIndex] = nums1[m - 1];
                m--;
            } else {
                nums1[tailIndex] = nums2[n - 1];
                n--;

            }
            tailIndex--;
        }
        while (n>0){
            nums1[tailIndex] = nums2[n - 1];
            tailIndex--;
            n--;
        }
    }
}
