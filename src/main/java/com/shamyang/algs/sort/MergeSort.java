package com.shamyang.algs.sort;

import java.util.Arrays;

/**
 * 归并排序
 * <p>
 * 参考链接{@link <a href=http://www.cnblogs.com/jingmoxukong/p/4308823.html/>}
 * </p>
 *
 * @author yangzhibin@che001.com
 * @date 2017/1/12
 */
public class MergeSort {

    /**
     * 合并数据
     * <p>
     * 将原始的 {@Code a}分成两组，然后将两组数据再合并到一组
     * 合并规则就是比较两个元素，小的放入，大的后放
     * </p>
     *
     * @param a
     * @param lo
     * @param hi
     */
    public void merge(Comparable[] a, int lo, int hi) {
        Comparable[] tmp = new Comparable[hi - lo + 1];
        int          i   = lo;
        int          mid = (lo + hi) / 2;
        int          j   = mid + 1;
        //将原数组从中间分成两部分,然后将两部分合并成一个数组
        for (int n = 0; n < tmp.length; n++) {
            if (i > mid) {
                tmp[n] = a[j++];
            } else if (j > hi) {
                tmp[n] = a[i++];
            } else if (a[i].compareTo(a[j]) < 0) {
                tmp[n] = a[i++];
            } else {
                tmp[n] = a[j++];
            }
        }
        //将合并好的数据复制到原数组中
        //这里千万注意复制的范围
        for (i = 0; i < tmp.length; i++) {
            a[lo++] = tmp[i];
        }
    }

    public void mergeSort(Comparable[] a, int lo, int hi) {
        if (lo < hi) {
            int mid = (lo + hi) / 2;
            mergeSort(a, lo, mid);
            mergeSort(a, mid + 1, hi);
            merge(a, lo, hi);
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        Integer[] integers  = new Integer[]{1, 9, 2, 3, 8,1,7};
        mergeSort.mergeSort(integers, 0, integers.length-1);
        Arrays.stream(integers).forEach(e -> System.out.println(e + " "));
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
