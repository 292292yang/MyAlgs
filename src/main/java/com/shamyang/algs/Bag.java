package com.shamyang.algs;

/**
 * <p>
 *     口袋
 *     只允许添加、查看元素
 * </p>
 * Created by yangzhibin on 2017/1/10.
 */
public class Bag<T> {

    private class Node<T>{
        private T item;
        private Node<T> next;
    }

    private int size;
    //袋口处
    private Node<T> first;

    public Bag() {
        size=0;
        first=null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void add(T item){
        Node<T> oldFirst=first;
        first=new Node<>();
        first.item=item;
        first.next=oldFirst;
        size++;
    }
}
