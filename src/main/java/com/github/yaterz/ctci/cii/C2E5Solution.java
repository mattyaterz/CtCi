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
    public static LinkedIntNode addForward( LinkedIntNode left, LinkedIntNode right ) {
        if ( left == null || right == null ) {
            return nullCases( left, right );
        }

        LinkedIntNode sum = new LinkedIntNode();

        for ( long total = getForwardNum( left, 0 ) + getForwardNum( right, 0 ); total > 0; total /= 10 ) {
            LinkedIntNode node = sum.next;
            sum.next = new LinkedIntNode( (int)( total % 10 ) );
            sum.next.next = node;
        }

        return sum.next;
    }

    public static LinkedIntNode addReverse( LinkedIntNode left, LinkedIntNode right ) {
        if ( left == null || right == null ) {
            return nullCases( left, right );
        }

        LinkedIntNode sum = new LinkedIntNode();
        LinkedIntNode node = sum;

        for ( long total = getReverseNum( left, 0 ) + getReverseNum( right, 0 ); total > 0; total /= 10 ) {
            node.next = new LinkedIntNode( (int)( total % 10 ) );
            node = node.next;
        }

        return sum.next;
    }

    static LinkedIntNode nullCases( LinkedIntNode left, LinkedIntNode right ) {
        if ( left == null ) {
            if ( right == null ) {
                return new LinkedIntNode( 0 );
            }

            return right;
        }

        return left;
    }

    static long getForwardNum( LinkedIntNode node, int value ) {
        if ( node == null ) {
            return value;
        }

        return getForwardNum( node.next, value * 10 + node.element );
    }

    static long getReverseNum( LinkedIntNode node, int power ) {
        if ( node == null ) {
            return 0;
        }

        return node.element * (long)Math.pow( 10, power ) + getReverseNum( node.next, ++power );
    }
}
