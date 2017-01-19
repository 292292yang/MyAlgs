package com.shamyang.algs.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 参考链接<a href="http://blog.csdn.net/lg1259156776/article/details/48689323"/>
 *
 * @author yangzhibin@che001.com
 * @date 2017/1/19
 */
public class InsertSort {


    /**
     * 插入排序算法
     *
     * @param t
     */
    public static void insertSort(Comparable[] t) {
        for (int i = 1; i < t.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(t[j], t[j - 1])) {
                    exch(t, j, j - 1);
                }
            }
        }
    }

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

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{
                1, 10, 8, 2, 5, 4
        };

        insertSort(integers);
        Arrays.stream(integers).forEach(System.out::println);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
