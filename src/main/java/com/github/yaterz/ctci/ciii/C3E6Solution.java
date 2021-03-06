package com.github.yaterz.ctci.ciii;

/**
 * Sort a Stack in ascending order (largest item on top) using at most
 * one addition Stack (and not any other data structure) to hold items
 *
 * @author mattyaterz
 * @since 11/23/14
 */
public class C3E6Solution {
    public static <E extends Comparable<E>> void sortStack( LinkedStack<E> stack ) {
        LinkedStack<E> tmpStack = new LinkedStack<>();
        int size = stack.size();

        for ( int i = 0; i < size - 1; i++ ) {
            E smallest = stack.pop();

            for ( int j = i + 1; j < size; j++ ) {
                E next = stack.pop();

                if ( smallest.compareTo( next ) < 0 ) {
                    tmpStack.push( smallest );
                    smallest = next;
                }
                else {
                    tmpStack.push( next );
                }
            }

            stack.push( smallest );

            for ( int k = i + 1; k < size; k++ ) {
                stack.push( tmpStack.pop() );
            }
        }
    }
}
