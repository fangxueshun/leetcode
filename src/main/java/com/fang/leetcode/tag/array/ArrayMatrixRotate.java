package com.fang.leetcode.tag.array;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * description
 * <p>
 * 给定一个 n × n 的二维矩阵表示一个图像。
 * <p>
 * 将图像顺时针旋转 90 度。
 * <p>
 * 说明：
 * <p>
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 * <p>
 * 示例 1:
 * <p>
 * 给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * 示例 2:
 * <p>
 * 给定 matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [15,13, 2, 5],
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * ]
 *
 * @author fangxueshun
 * @date 2018/8/9
 */
public class ArrayMatrixRotate {

    /**
     * 寻找特点：目标矩阵为当前矩阵左上到右下方向切线上的元素反转，如上述队列中的[2,1],[13,4,9],[15,3,8,11]等，之后每一列元素反转得到
     * <p>参考https://www.cnblogs.com/wayne793377164/p/7229592.html
     * 该方法时间复杂度低，但是通用性不高，比如旋转k个单位，就不适用了。
     * 旋转k个单位可以考虑矩阵从外层，到内层的数据，依次旋转k个单位。（TODO 完成该解法）
     *
     * @param matrix
     */
    public static void rotate(int[][] matrix) {
        if (matrix.length < 2) {
            return;
        }
        //对调对角元素
        int temp;
        for (int i = 0; i < matrix.length-1; i++) {
            int startRawIndex = 0;
            int startColIndex = i;
            int endRawIndex = matrix.length - i - 1;
            int endColIndex = matrix.length - 1;

            while (startRawIndex < endRawIndex) {
                temp = matrix[endRawIndex][endColIndex];
                matrix[endRawIndex][endColIndex] = matrix[startRawIndex][startColIndex];
                matrix[startRawIndex][startColIndex] = temp;
                //将对称的另一侧反转
                if (startColIndex != startRawIndex) {
                    temp = matrix[endColIndex][endRawIndex];
                    matrix[endColIndex][endRawIndex] = matrix[startColIndex][startRawIndex];
                    matrix[startColIndex][startRawIndex] = temp;
                }
                startRawIndex++;
                startColIndex++;
                endRawIndex--;
                endColIndex--;
            }
        }


        //反转每一列元素
        for (int i = 0; i < matrix.length; i++) {
            int colStart = 0;
            int colEnd = matrix.length - 1;
            while (colStart < colEnd) {
                temp = matrix[colEnd][i];
                matrix[colEnd][i] = matrix[colStart][i];
                matrix[colStart][i] = temp;
                colStart++;
                colEnd--;
            }
        }

    }

//    private static void outlog(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.stream(matrix[i]).boxed().collect(Collectors.toList()));
//        }
//        System.out.println("------------------------");
//        System.out.println("\n");
//    }
}
