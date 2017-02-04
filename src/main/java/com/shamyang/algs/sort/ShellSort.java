package com.shamyang.algs.sort;

/**
 * <p>
 *     希尔排序
 *     参考链接：http://blog.csdn.net/morewindows/article/details/6668714
 *     更好一点的：http://www.cnblogs.com/jingmoxukong/p/4303279.html
 * </p>
 * @author yangzhibin@che001.com
 * @date 2017/2/4
 */
public class ShellSort {

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

    public static void shellSort(Comparable[] t,int n){
        for(int gap=n/2;gap>0;gap=gap/2){
            //把距离为 gap 的元素编为一个组，扫描所有组
            for(int i=gap;i<n;i++){
                //对距离为 gap 的元素组进行插入排序
                for(int j=i-gap;j>=0&&less(t[j+gap],t[j]);j=j-gap){
                    exch(t,j,j+gap);
                }
            }
        }
    }
}
