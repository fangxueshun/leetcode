package com.fang.leetcode.tag.other;

/**
 * description
 *
 * @author fangxueshun
 * @date 2018/12/12
 */
public class SampleBitMap {
    private Long maxValue;
    private int[] array;

    public SampleBitMap(long maxValue) {
        this.maxValue = maxValue;
        int size = (int) maxValue >> 5;
        array = new int[size];
    }

    public void add(int value) {
        int index = value >> 5;
        int currentDex = array[index];
        int slot = value & 31;//计算需要标记的位置，类似取余
        array[index] = currentDex | (1 << (slot));
    }

    public boolean isExit(int value) {
        int index = value >> 5;
        int slot = value & 31;//计算需要标记的位置，类似取余
        int bit = array[index] >> (slot) & 0x01;
        return bit == 1;
    }

    public static void main(String[] args) {
        SampleBitMap bitMap = new SampleBitMap(Integer.MAX_VALUE>>16);
        bitMap.add(1);
        bitMap.add(32);
        bitMap.add(33);
        bitMap.add(34);
        for(int i =1;i<100;i++){
            System.out.println(i+">>>>>>>>"+bitMap.isExit(i));
        }
    }
}
