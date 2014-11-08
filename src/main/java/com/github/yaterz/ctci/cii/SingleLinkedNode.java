package com.github.yaterz.ctci.cii;

/**
 * @author mattyaterz
 * @since 11/8/14
 */
public class SingleLinkedNode {
    public SingleLinkedNode() {
    }

    public SingleLinkedNode( Object element ) {
        this.element = element;
    }

    public SingleLinkedNode( Object element, SingleLinkedNode next ) {
        this.element = element;
        this.next = next;
    }

    public Object element;
    public SingleLinkedNode next;
}
