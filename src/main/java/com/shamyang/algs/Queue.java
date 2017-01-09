package com.shamyang.algs;

/**
 * <p>
 *     队列
 * </p>
 * Created by yangzhibin on 2017/1/9.
 */
public class Queue<T> {

    private class Node<T>{
        private T item;
        private int size;
    }

    private Node<T> first;

    private Node<T> last;

    private int size=0;

    public Queue() {
        first=null;
        last=null;
        size=0;
    }
}
