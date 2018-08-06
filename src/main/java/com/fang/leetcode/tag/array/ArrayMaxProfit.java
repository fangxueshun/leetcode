package com.fang.leetcode.tag.array;

/**
 * description
 *给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * 示例 1:
 *
 * 输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 *
 *
 * @author fangxueshun
 * @date 2018/8/6
 */
public class ArrayMaxProfit {



    public static int maxProfitBusiness(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int totalProfit = 0;
        int tempProfit = -1;
        boolean isHasBuy = false;
        for(int i = 1; i < prices.length ; i++){
            int currentProfit = prices[i];
            int lastDayProfit = prices[i-1];
            boolean isCurrentDayGreatThtanLastDay = currentProfit - lastDayProfit > 0;

            if(isCurrentDayGreatThtanLastDay){
                if(i == (prices.length - 1)){
                    if(tempProfit !=-1){
                        totalProfit = totalProfit + currentProfit - tempProfit;
                    }else {
                        totalProfit =  totalProfit+ currentProfit - lastDayProfit;
                    }

                    continue;
                }
                //买进
                if(!isHasBuy){
                    tempProfit = lastDayProfit;
                    isHasBuy = true;
                }

            }else {
                if(tempProfit == -1){
                    continue;
                }
                //卖出
                totalProfit = totalProfit + (lastDayProfit - tempProfit);
                tempProfit = -1;
                isHasBuy = false;

            }

        }
        return totalProfit;
    }


    /**
     * 考察点：问题抽象的能力，该问题核心是求多个序列中，增序列整体增量
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {

        int totalProfit = 0;
        for(int i = 1; i < prices.length ; i++){
            int currentProfit = prices[i];
            int lastDayProfit = prices[i-1];
            if(currentProfit > lastDayProfit){
                totalProfit = totalProfit + (currentProfit - lastDayProfit);
            }

        }
        return totalProfit;
    }
}
