package com.github.yaterz.ctci.cii;

/**
 * Given two numbers stored in individual linked lists in reverse order
 * add the numbers together and return the result in a new linked list
 *
 * Reverse example:
 * ( 7 -> 1 -> 6 ) + ( 5 -> 9 -> 2 ) = 617 + 295 = 912 = ( 2 -> 1 -> 9 )
 *
 * Forward example:
 * ( 6 -> 1 -> 7 ) + ( 2 -> 9 -> 5 ) = 617 + 295 = 912 = ( 9 -> 1 -> 2 )
 *
 * @author mattyaterz
 * @since 11/9/14
 */
public class C2E5Solution {
    public static SingleLinkedNode addForward( SingleLinkedNode left, SingleLinkedNode right ) {
        if ( left == null || right == null ) {
            return nullCases( left, right );
        }

        SingleLinkedNode sum = new SingleLinkedNode();

        for ( long total = getForwardNum( left, 0 ) + getForwardNum( right, 0 ); total > 0; total /= 10 ) {
            SingleLinkedNode node = sum.next;
            sum.next = new SingleLinkedNode( (int)( total % 10 ) );
            sum.next.next = node;
        }

        return sum.next;
    }

    public static SingleLinkedNode addReverse( SingleLinkedNode left, SingleLinkedNode right ) {
        if ( left == null || right == null ) {
            return nullCases( left, right );
        }

        SingleLinkedNode sum = new SingleLinkedNode();
        SingleLinkedNode node = sum;

        for ( long total = getReverseNum( left, 0 ) + getReverseNum( right, 0 ); total > 0; total /= 10 ) {
            node.next = new SingleLinkedNode( (int)( total % 10 ) );
            node = node.next;
        }

        return sum.next;
    }

    static SingleLinkedNode nullCases( SingleLinkedNode left, SingleLinkedNode right ) {
        if ( left == null ) {
            if ( right == null ) {
                return new SingleLinkedNode( 0 );
            }

            return right;
        }

        return left;
    }

    static long getForwardNum( SingleLinkedNode node, int value ) {
        if ( node == null ) {
            return value;
        }

        return getForwardNum( node.next, value * 10 + node.element );
    }

    static long getReverseNum( SingleLinkedNode node, int power ) {
        if ( node == null ) {
            return 0;
        }

        return node.element * (long)Math.pow( 10, power ) + getReverseNum( node.next, ++power );
    }
}
