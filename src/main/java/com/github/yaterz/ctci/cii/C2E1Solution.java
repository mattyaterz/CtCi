package com.github.yaterz.ctci.cii;

import com.github.yaterz.ctci.SingleLinkedNode;

/**
 * Write code to remove duplicates from an unsorted linked list (assuming no temporary buffer/HashSet)
 *
 * @author mattyaterz
 * @since 11/8/14
 */
public class C2E1Solution {
    public static void removeDuplicates( SingleLinkedNode first ) {
        if ( first == null ) {
            return;
        }

        SingleLinkedNode current = first;
        SingleLinkedNode runner;

        while ( current != null ) {
            runner = current;

            while ( runner.next != null ) {
                if ( current.element == runner.next.element ) {
                    runner.next = runner.next.next;
                }
                else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }
}
