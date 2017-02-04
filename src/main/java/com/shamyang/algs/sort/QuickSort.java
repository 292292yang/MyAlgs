package com.shamyang.algs.sort;

import java.util.Arrays;

/**
 * <p>
 * 快速排序
 * 参考链接：http://blog.csdn.net/morewindows/article/details/6684558
 * </p>
 *
 * @author yangzhibin@che001.com
 * @date 2017/2/4
 */
public class QuickSort {

    /**
     * 交换数组中的两个元素
     * 这里千万要注意传值和传引用的区别
     *
     * @param t
     * @param a
     * @param b
     */
    private static void exch(Comparable[] t, int a, int b) {
        Comparable tmp = t[a];

        t[a] = t[b];
        t[b] = tmp;
    }

    /**
     * v是否小于w
     *
     * @param v
     * @param w
     * @return
     */
    private static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0)
                ? true
                : false;
    }

    /**
     * v是否小于w
     *
     * @param v
     * @param w
     * @return
     */
    private static boolean lessOrEqual(Comparable v, Comparable w) {
        return (v.compareTo(w) <= 0)
                ? true
                : false;
    }

    /**
     * 快速排序
     *
     * @param t
     * @param left
     * @param right
     */
    public static void quickSort(Comparable[] t, int left, int right) {
        if (left > right) {
            return;
        }
        int        i   = left;
        int        j   = right;
        Comparable tmp = t[left];
        while (i != j) {
            while (lessOrEqual(tmp, t[j]) && j > i) {
                j--;
            }
            while (lessOrEqual(t[i], tmp) && i < j) {
                i++;
            }
            if (i < j) {
                exch(t, i, j);
            }
        }
        t[left] = t[i];
        t[i] = tmp;
        quickSort(t, left, i - 1);
        quickSort(t, i + 1, right);
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 9, 2, 3, 8, 1, 7};
        quickSort(integers, 0, 6);
        Arrays.stream(integers).forEach(e -> System.out.print(e + " "));
    }
}
