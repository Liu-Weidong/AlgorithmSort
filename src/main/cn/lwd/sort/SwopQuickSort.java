package main.cn.lwd.sort;

import java.util.Arrays;

/**
 * @author lwd
 * @date 2020/5/31
 * @desc 交换排序 - 快速排序
 *
 * 【基本思想】
 * 1.选取第一个数为基准
 * 2.将比基准小的数交换到前面，比基准大的数交换到后面
 * 3.对左右区间重复第二步，直到各区间只有一个数
 */
public class SwopQuickSort {

    public static void main(String[] args) {
        int[] array = {9, 4, 8, 2, 5};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        int first = low, last = high;
        int base = a[first];
        while (first < last) {
            while (first < last && a[last] >= base) {
                last--;
            }
            if (first < last) {
                a[first++] = a[last];
            }
            while (first < last && a[first] <= base) {
                first++;
            }
            if (first < last) {
                a[last--] = a[first];
            }
        }
        a[first] = base;
        quickSort(a, low, first - 1);
        quickSort(a, first + 1, high);
    }
}
