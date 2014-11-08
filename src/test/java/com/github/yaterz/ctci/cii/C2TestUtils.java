package com.github.yaterz.ctci.cii;

/**
 * @author mattyaterz
 * @since 11/8/14
 */
public class C2TestUtils {
    public static SingleLinkedNode asLinkedList( int[] array ) {
        SingleLinkedNode head = new SingleLinkedNode();
        SingleLinkedNode current = head;

        for ( int value : array ) {
            current.next = new SingleLinkedNode( value );
            current = current.next;
        }

        return head.next;
    }

    public static Object[] asArray( SingleLinkedNode node ) {
        if ( node == null ) {
            return new Object[0];
        }

        SingleLinkedNode current = node;
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
}
