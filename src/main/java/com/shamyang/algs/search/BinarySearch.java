package com.shamyang.algs.search;

import java.util.Random;

/**
 * 二分查找
 * @author yangzhibin@che001.com
 * @date 2017/1/12
 */
public class BinarySearch {
    private BinarySearch() {}

    /**
     * 返回数组中的元素所在的下表
     *
     * @param a   整形数组,必须是经过排序之后的
     * @param key 要查找的key
     * @return 如果数组中存在返回 {@code a} 中的下表,不存在则返回 {@code -1}
     */
    public static int index(int[] a, int key) {
        int lo = 0;
        int hi = a.length;

        // 小心别漏掉hi==lo的情况
        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;

            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // 随机生成10000个100以内的数字,然后对其进行去重排序,注意排序是升序的,然后查找7这个数字
        System.out.println(BinarySearch.index(new Random().ints(0, 100).limit(10000).distinct().sorted().toArray(), 7));
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
