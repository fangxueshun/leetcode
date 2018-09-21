package com.fang.leetcode.tag.other;

/**
 * Author: fangxueshun
 * Description:
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * Date: 2018/9/21
 * Time: 23:26
 */
public class MaxSubArray {

    /**
     * 当从头遍历数组元素时，对于数组中的一个整数有几种选择呢？
     * 两种：加入之前的subArray；自己另起一个新的subArray.那么时候会出现这两种状况：
     * - 当之前subArray 的总和大于 0 时，我们认为 其对后续结果是有贡献的，这种情况下，我们选择加入之前的subArray
     * - 当之前subArray 的总和小于等于0时，我们认为其对后续结果是没有贡献的，这种情况下，我们选择以当前数字开始，另起一个subArray
     *
     * 设状态f(j) 表示 以 nums[j] 为结尾的最大连续子序列的和，则状态转移方程如下：
     * f(j) = max{f(j)+nums[j], nums[j]},其中1<=j<=n
     * target = max{f(j)}, 其中1<=j<=n
     *
     * -------TODO 严谨的数学证明--------------
     *
     *
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int result = nums[0];
        int sum = nums[0];
        for(int i = 1; i<nums.length;i++){
            sum = Math.max(sum+nums[i],nums[i]);
            result = Math.max(sum,result);
        }
        return result;
    }


}
