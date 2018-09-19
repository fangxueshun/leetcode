package com.fang.leetcode.tag.other;

/**
 * Author: fangxueshun
 * Description:
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 注意你不能在买入股票前卖出股票。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 * <p>
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * Date: 2018/9/19
 * Time: 22:52
 */
public class MaxProfit {

    /**
     * 直接全部枚举出来，时间复杂度O(n2)
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int maxProfit = 0;
        for(int i = 0; i < prices.length-1 ;i++){
            int current = prices[i];
            for(int j = i;j<prices.length;j++){
                int profit = prices[j] - current;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }


    /**
     * f(x) = {
     *     0 , prices.length<2
     *     am - amin , prices.length<2
     * }
     *
     * @param prices
     * @return
     */
    public static int maxProfitByOneLoop(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length ;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
                continue;
            }
            if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }

        }
        return maxProfit;
    }
}

