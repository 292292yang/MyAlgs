package com.shamyang.algs.search;

/**
 * <p>
 * 二分查找
 * </p>
 *
 * @author yangzhibin@che001.com
 * @date 2017/1/12
 */
public class BinarySearch {

    private BinarySearch() {

    }

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
        while (hi > lo) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 8, 9, 11, 12, 15};
        System.out.println(BinarySearch.index(a, 1));
    }
}
