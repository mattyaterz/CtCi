package com.github.yaterz.ctci;

/**
 * @author mattyaterz
 * @since 11/20/14
 */
public class LinkedStack {
    SingleLinkedNode top = null;
    int size = 0;

    public Integer peek() {
        if ( top == null ) {
            return null;
        }

        return top.element;
    }

    public Integer pop() {
        if ( top == null ) {
            return null;
        }

        SingleLinkedNode tmp = top;
        top = top.next;
        size--;
        return tmp.element;
    }

    public boolean push( int element ) {
        SingleLinkedNode stack = top;
        top = new SingleLinkedNode( element );
        top.next = stack;
        size++;
        return true;
    }

    public int size() {
        return size;
    }
}
