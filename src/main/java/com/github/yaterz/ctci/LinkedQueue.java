package com.github.yaterz.ctci;

/**
 * @author mattyaterz
 * @since 11/20/14
 */
public class LinkedQueue {
    SingleLinkedNode first = null;
    SingleLinkedNode last = null;
    int size = 0;

    public Integer peek() {
        if ( first == null ) {
            return null;
        }

        return first.element;
    }

    public boolean enqueue( int element ) {
        if ( first == null ) {
            last = new SingleLinkedNode( element );
            first = last;
        }
        else {
            last.next = new SingleLinkedNode( element );
            last = last.next;
        }

        size++;
        return true;
    }

    public Integer dequeue() {
        if ( first == null ) {
            return null;
        }

        int element = first.element;
        first = first.next;
        size--;
        return element;
    }

    public int size() {
        return size;
    }
}
