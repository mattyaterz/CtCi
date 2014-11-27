package com.github.yaterz.ctci.cii;

/**
 * Find the kth to last element in a singly linked list
 *
 * @author mattyaterz
 * @since 11/8/14
 */
public class C2E2Solution {
    public static LinkedIntNode getFromEndAt( LinkedIntNode first, int reverseOffset ) {
        LinkedIntNode current = first;
        int size = 0;

        while ( current != null ) {
            size++;
            current = current.next;
        }

        if ( reverseOffset >= size ) {
            return null;
        }

        current = first;

        for ( int pos = 1; pos <= size; pos++ ) {
            if ( size - pos == reverseOffset ) {
                return current;
            }

            current = current.next;
        }

        return current;
    }

    public static LinkedIntNode getFromEndRecursive( LinkedIntNode node, int reverseOffset ) {
        if ( node == null ) {
            return null;
        }

        return getPositionFromEnd( node, reverseOffset, new Position( 0 ) );
    }

    static LinkedIntNode getPositionFromEnd( LinkedIntNode first, int reverseOffset, Position pos ) {
        if ( first == null ) {
            pos.position = -1;
            return null;
        }

        LinkedIntNode node = getPositionFromEnd( first.next, reverseOffset, pos );
        pos.position += 1;

        if ( pos.position == reverseOffset ) {
            return first;
        }

        return node;
    }

    static class Position {
        Position( int position ) {
            this.position = position;
        }

        int position;
    }
}
