package util;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2018/8/11
 * Time: 22:40
 */
public class EasyArray {

    /**
     * 反转 char类型数组
     * @param arrays
     */
    public static void reverseCharArray(char[] arrays){
        if (null == arrays) {
            throw new NullPointerException("arrays should not be null");
        }
        if (arrays.length < 2) {
            return;
        }
        int start = 0;
        int end = arrays.length - 1;
        while (start < end) {
            char temp = arrays[end];
            arrays[end] = arrays[start];
            arrays[start] = temp;
            start++;
            end--;
        }
    }

    /**
     * 反转数组
     *
     * @param arrays
     * @param <T>
     */
    public static <T> void  reverse(T[] arrays) {
        if (null == arrays) {
            throw new NullPointerException("arrays should not be null");
        }
        if (arrays.length < 2) {
            return;
        }
        int start = 0;
        int end = arrays.length - 1;
        while (start < end) {
            T temp = arrays[end];
            arrays[end] = arrays[start];
            arrays[start] = temp;
            start++;
            end--;
        }
    }
}
