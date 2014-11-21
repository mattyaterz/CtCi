package com.github.yaterz.ctci.cii;

import com.github.yaterz.ctci.LinkedStack;
import com.github.yaterz.ctci.SingleLinkedNode;

/**
 * Is the linked list a palindrome?
 *
 * E.g. - 1290880921 or 123454321
 *
 * @author mattyaterz
 * @since 11/19/14
 */
public class C2E7Solution {
    public static boolean isPalindrome( SingleLinkedNode head ) {
        if ( head == null ) {
            return false;
        }

        LinkedStack stack = new LinkedStack();
        SingleLinkedNode runner = head;

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
}
