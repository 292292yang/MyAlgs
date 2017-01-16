package com.shamyang.algs;

/**
 * Created by yangzhibin on 2017/1/10.
 */
public class Bag<T> {
    private int size;

    private Node<T> first;

    public Bag() {
        size  = 0;
        first = null;
    }

    public void add(T item) {
        Node<T> oldFirst = first;

        first      = new Node<>();
        first.item = item;
        first.next = oldFirst;
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    private class Node<T> {
        private T       item;
        private Node<T> next;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
