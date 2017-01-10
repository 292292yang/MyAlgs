package com.shamyang.algs;

import java.util.NoSuchElementException;

/**
 * <p>
 *     队列
 * </p>
 * Created by yangzhibin on 2017/1/9.
 */
public class Queue<T> {


    private class Node<T>{
        private T item;
        private Node<T> next;
    }

    private Node<T> first;

    private Node<T> last;

    private int size=0;

    public Queue() {
        first=null;
        last=null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void enqueue(T item){
        Node<T> oldLast=last;
        last=new Node<>();
        last.item=item;
        last.next=null;
        if(isEmpty()) first=last;
        else oldLast.next=last;
        size++;
    }

    public T dequeue(){
        if(isEmpty()) throw new NoSuchElementException("Queue is empty");
        T item=first.item;
        first=first.next;
        size--;
        return item;
    }

    public T peek(){
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return first.item;
    }

    public static void main(String[] args) {
        Queue<Integer> queue=new Queue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
