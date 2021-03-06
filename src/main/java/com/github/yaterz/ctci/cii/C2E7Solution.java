package com.github.yaterz.ctci.cii;

/**
 * Is the linked list a palindrome?
 *
 * E.g. - 1290880921 or 123454321
 *
 * @author mattyaterz
 * @since 11/19/14
 */
public class C2E7Solution {
    public static boolean isPalindrome( LinkedIntNode head ) {
        if ( head == null ) {
            return false;
        }

        SingleLinkedIntStack stack = new SingleLinkedIntStack();
        LinkedIntNode runner = head;

        while ( runner != null ) {
            stack.push( runner.element );
            runner = runner.next;
        }

        runner = head;

        while ( runner != null ) {
            if ( runner.element != stack.pop() ) {
                return false;
            }

            runner = runner.next;
        }

        return true;
    }

    public static class SingleLinkedIntStack {
        LinkedIntNode top = null;
        int size = 0;

        public Integer peek() {
            if ( top == null ) {
                return null;
            }

            return top.element;
        }

        public Integer pop() {
            if ( top == null ) {
                return null;
            }

            LinkedIntNode tmp = top;
            top = top.next;
            size--;
            return tmp.element;
        }

        public boolean push( int element ) {
            LinkedIntNode stack = top;
            top = new LinkedIntNode( element );
            top.next = stack;
            size++;
            return true;
        }

        public int size() {
            return size;
        }
    }
}
