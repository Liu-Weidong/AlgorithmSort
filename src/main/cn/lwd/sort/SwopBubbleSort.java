package main.cn.lwd.sort;

import java.util.Arrays;

/**
 * @author lwd
 * @date 2020/5/31
 * @desc 交换排序 - 冒泡排序
 * <p>
 * 【基本思想】
 * 两个数比较大小，较大的数下沉，较小的数冒起来。
 * 【算法描述】
 * 假设待排序表长为 n，从前往后（从后往前）比较两两相邻元素的值，若为逆序（即 A[i-1] > A[i]），则交换直到序列比较结束。
 * <p>
 * 一趟冒泡会将一个元素放置到它最终的位置上，总共需要 n-1 趟冒泡。
 */
public class SwopBubbleSort {

    public static void main(String[] args) {
        int[] array = {9, 4, 8, 2, 5};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    /**
     * 由小到大排序
     *
     * @param a
     * @return
     */
    private static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {// 由小到大
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}
