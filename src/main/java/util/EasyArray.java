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
        reverseCharArray(arrays,0,arrays.length-1);
    }

    /**
     * @param arrays
     * @param startIndex
     * @param endIndex
     */
    public static void reverseCharArray(char[] arrays,int startIndex,int endIndex){
        if (null == arrays) {
            throw new NullPointerException("arrays should not be null");
        }
        if (arrays.length < 2) {
            return;
        }
        if(endIndex > arrays.length-1 || endIndex < 0 || startIndex <0){
            throw new IllegalArgumentException("index not in 0-"+(arrays.length-1));
        }

        while (startIndex < endIndex) {
            char temp = arrays[endIndex];
            arrays[endIndex] = arrays[startIndex];
            arrays[startIndex] = temp;
            startIndex++;
            endIndex--;
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
