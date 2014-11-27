package com.github.yaterz.ctci.cii;

/**
 * Partition a linked list around a value X
 * I.e. - the values less than X come before all the values greater than or equal to X
 *
 * @author mattyaterz
 * @since 11/9/14
 */
public class C2E4Solution {
    public static LinkedIntNode partition( LinkedIntNode head, int partition ) {
        LinkedIntNode lower = new LinkedIntNode();
        LinkedIntNode upper = new LinkedIntNode();

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

    static void add( LinkedIntNode head, int add ) {
        while ( head.next != null ) {
            head = head.next;
        }

        head.next = new LinkedIntNode( add );
    }
}
