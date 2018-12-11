package com.fang.leetcode.tag.other;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/12/12
 * Time: 0:16
 */
public class BitMap {
    private long length;
    private static int[] bitsMap;

    //构造函数中传入数据中的最大值
    public BitMap(long length) {
        this.length = length;
        // 根据长度算出，所需数组大小
        bitsMap = new int[(int) (length >> 5) + ((length & 31) > 0 ? 1 : 0)];
    }

    public boolean getBit(long index) {
        int intData = bitsMap[(int) ((index - 1) >> 5)];
        int offset = (int) ((index - 1) & 31);
        return (intData >> offset & 0x01)==1?true:false;
    }


    public void setBit(long index) {
        // 求出该index - 1所在bitMap的下标
        int belowIndex = (int) ((index - 1) >> 5);
        // 求出该值的偏移量(求余)
        int offset = (int) ((index - 1) & 31);
        int inData = bitsMap[belowIndex];
        bitsMap[belowIndex] = inData | (0x01 << offset);
    }
    public static void main(String[] args) {
        BitMap bitMap = new BitMap(Integer.MAX_VALUE>>16);
        bitMap.setBit(1);
        bitMap.setBit(32);
        bitMap.setBit(33);
        bitMap.setBit(34);
        for(int i =1;i<100;i++){
            System.out.println(i+">>>>>>>>"+bitMap.getBit(i));
        }

    }
}


