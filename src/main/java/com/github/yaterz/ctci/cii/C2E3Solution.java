package com.github.yaterz.ctci.cii;

/**
 * @author mattyaterz
 * @since 11/8/14
 */
public class C2E3Solution {
    public static void removeNode( SingleLinkedNode node ) {
        if ( node == null ) {
            return;
        }

        if ( node.next != null ) {
            SingleLinkedNode next = node.next;
            node.next = next.next;
            node.element = next.element;
        }
    }
}
