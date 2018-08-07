package com.fang.leetcode.tag.array;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Author: fangxueshun
 * Description:
 * <p>
 * 给定两个数组，写一个方法来计算它们的交集。
 * <p>
 * 例如:
 * 给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
 * <p>
 * 注意：
 * <p>
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 跟进:
 * <p>
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？ //
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果nums2的元素存储在磁盘上，内存是有限的，你不能一次加载所有的元素到内存中，你该怎么办？
 * <p>
 * Date: 2018/8/7
 * Time: 20:41
 */
public class ArrayIntersect {


    /**
     * 该方法将容量较大的数组映射为key为值，value为出现次数的map
     * 遍历较小的数组，如果map中有该key且，vaue不等于0，放入临时数组
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }
        boolean isNums1GreatTahnNums2 = nums1.length >= nums2.length;
        Map<Integer, Integer> map = isNums1GreatTahnNums2 ? array2Map(nums1) : array2Map(nums2);

        List<Integer> tempList = new ArrayList<>();
        for (int num : isNums1GreatTahnNums2 ? nums2 : nums1) {
            if (map.containsKey(num) && map.get(num) != 0) {
                tempList.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] temp = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            temp[i] = tempList.get(i);
        }

        return temp;
    }

    /*TODO 其他解法*/

    /**
     * 数组中的值和出现次数的映射
     *
     * @param nums
     * @return
     */
    private static Map<Integer, Integer> array2Map(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        return map;
    }

}
