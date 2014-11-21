package com.github.yaterz.ctci.cii;

import com.github.yaterz.ctci.SingleLinkedNode;

/**
 * Partition a linked list around a value X
 * I.e. - the values less than X come before all the values greater than or equal to X
 *
 * @author mattyaterz
 * @since 11/9/14
 */
public class C2E4Solution {
    public static SingleLinkedNode partition( SingleLinkedNode head, int partition ) {
        SingleLinkedNode lower = new SingleLinkedNode();
        SingleLinkedNode upper = new SingleLinkedNode();

        while ( head != null ) {
            if ( head.element < partition ) {
                add( lower, head.element );
            }
            else {
                add( upper, head.element );
            }

            head = head.next;
        }

        head = lower;

        while ( head.next != null ) {
            head = head.next;
        }

        head.next = upper.next;
        return lower.next;
    }

    static void add( SingleLinkedNode head, int add ) {
        while ( head.next != null ) {
            head = head.next;
        }

        head.next = new SingleLinkedNode( add );
    }
}
