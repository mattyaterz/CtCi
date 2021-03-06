package com.github.yaterz.ctci.cii;

/**
 * Delete a node in the middle of a singly linked list given the node to delete (not the head of the list)
 *
 * @author mattyaterz
 * @since 11/8/14
 */
public class C2E3Solution {
    public static void removeNode( LinkedIntNode node ) {
        if ( node == null ) {
            return;
        }

        if ( node.next != null ) {
            LinkedIntNode next = node.next;
            node.next = next.next;
            node.element = next.element;
        }
    }
}
