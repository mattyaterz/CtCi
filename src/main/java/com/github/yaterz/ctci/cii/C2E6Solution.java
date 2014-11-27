package com.github.yaterz.ctci.cii;

/**
 * Given a circular linked list, find the node at the beginning of the loop
 * As per usual, don't just use HashSet
 *
 * Given: A -> B -> C -> D -> E -> C
 * Return: C
 *
 * @author mattyaterz
 * @since 11/9/14
 */
public class C2E6Solution {
    public static LinkedIntNode findLoop( LinkedIntNode head ) {
        LinkedIntNode current = head;

        for ( int i = 0; current != null; i++ ) {
            LinkedIntNode runner = head;

            for ( int j = 0; j < i; j++ ) {
                if ( runner == current ) {
                    return current;
                }

                runner = runner.next;
            }

            current = current.next;
        }

        return null;
    }
}
