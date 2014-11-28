package com.github.yaterz.ctci.ciii;

/**
 * Design a Stack which in addition to push() and pop(), includes a min() method that returns the smallest value in the
 * Stack.  All three methods must run in O(1) time
 *
 * @author mattyaterz
 * @since 11/20/14
 */
public class C3E2Solution {

    public static class MinimumTrackingStack {
        public boolean push( int element ) {
            if ( top == null ) {
                top = new MinNode( element, element );
            }
            else {
                MinNode node = top;
                top = new MinNode( element, Math.min( element, top.min ) );
                top.next = node;
            }

            return true;
        }

        public Integer pop() {
            if ( top == null ) {
                return null;
            }

            int element = top.element;
            top = top.next;
            return element;
        }

        public Integer min() {
            return top == null ? null : top.min;
        }

        MinNode top = null;

        private static class MinNode {
            public MinNode( int element, int min ) {
                this.element = element;
                this.min = min;
            }

            public MinNode next;
            public int element;
            public int min;
        }
    }
}
