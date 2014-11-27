package com.github.yaterz.ctci.cii;

/**
 * @author mattyaterz
 * @since 11/8/14
 */
public class C2TestUtils {
    public static LinkedIntNode asLinkedList( int... array ) {
        LinkedIntNode head = new LinkedIntNode();
        LinkedIntNode current = head;

        for ( int value : array ) {
            current.next = new LinkedIntNode( value );
            current = current.next;
        }

        return head.next;
    }

    public static LinkedIntNode asLoopedList( int loopIndex, int... array ) {
        LinkedIntNode head = new LinkedIntNode();
        LinkedIntNode current = head;
        LinkedIntNode loop = null;

        for ( int i = 0; i < array.length; i++ ) {
            current.next = new LinkedIntNode( array[ i ] );

            if ( i == loopIndex ) {
                loop = current.next;
            }

            current = current.next;
        }

        current.next = loop;
        return head.next;
    }

    public static Object[] asArray( LinkedIntNode node ) {
        if ( node == null ) {
            return new Object[0];
        }

        LinkedIntNode current = node;
        int size = 0;

        while ( current != null ) {
            current = current.next;
            size++;
        }

        Object[] array = new Object[ size ];
        current = node;

        for ( int i = 0; i < size; i++ ) {
            array[ i ] = current.element;
            current = current.next;
        }

        return array;
    }

    public static LinkedIntNode getAtIndex( LinkedIntNode list, int offset ) {
        if ( offset == 0 || list == null ) {
            return list;
        }

        return getAtIndex( list.next, --offset );
    }
}
