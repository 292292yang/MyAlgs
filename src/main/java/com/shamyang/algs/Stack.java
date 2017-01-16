package com.shamyang.algs;

import java.util.NoSuchElementException;

/**
 * Created by yangzhibin on 2017/1/9.
 */
public class Stack<T> {
    private int     size = 0;
    private Node<T> first;

    public Stack() {
        first = null;
        size  = 0;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 10; i++) {
            stack.push(i * 10);
        }

        // ------
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + "------" + stack.size());
        }
    }

    /**
     * <p>
     *     ??????????
     *     ????????????????
     * </p>
     * @return
     */
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        return first.item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        T item = first.item;

        first = first.next;
        size--;

        return item;
    }

    public void push(T t) {
        Node<T> oldFirst = first;

        first      = new Node<T>();
        first.item = t;
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
