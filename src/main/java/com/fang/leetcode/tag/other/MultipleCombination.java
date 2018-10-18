package com.fang.leetcode.tag.other;

/**
 * Author: fangxueshun
 * Description:
 * <p>
 * <p>
 * Date: 2018/10/18
 * Time: 22:58
 */
public class MultipleCombination {

    /**
     * 单选题组合方式
     * 考虑如下情况，有多个单选题，每个题目选项长度不定，列出全部的选下组合
     * 如果[1,2]和[3,4],共有2*2四种组合方式，（1，3）（1，4）（2，3）（2，4）
     *
     * @param arrays
     * @return
     */
    public String[] singleSelectionComb(String[]... arrays) {
        if (arrays.length == 1) {
            String[] temp = new String[arrays[0].length];
            for (int i = 0; i < arrays[0].length; i++) {
                temp[i] = arrays[0][i];
            }
            return temp;
        }else {

        }
        return null;
    }
}
