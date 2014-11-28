package com.github.yaterz.ctci.ciii;

/**
 * @author mattyaterz
 * @since 11/25/14
 */
public class LinkedNode<E> {
    public LinkedNode( E element ) {
        this.element = element;
    }

    public LinkedNode( E element, LinkedNode<E> next ) {
        this.element = element;
        this.next = next;
    }

    public E element;
    public LinkedNode<E> next;
}
