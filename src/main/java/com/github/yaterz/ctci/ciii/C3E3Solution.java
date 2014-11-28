package com.github.yaterz.ctci.ciii;

import java.util.ArrayList;

/**
 * Create a 'SetOfStacks' that mimics the stacking of plates in your cabinets, i.e. - if the stack exceeds some
 * threshold, you create a new stack next to the original one. The push() and pop() methods should work exactly as
 * though this was a single stack. Create a popAt(int) method as though the Stack is also a List
 *
 * @author mattyaterz
 * @since 11/22/14
 */
public class C3E3Solution {
    public static class SetOfStacks<E> {
        public SetOfStacks( int singleStackThreshold ) {
            this.threshold = singleStackThreshold;
        }

        public E peek() {
            return !stacks.isEmpty() ? getLastStack().peek() : null;
        }

        public E pop() {
            E element = !stacks.isEmpty() ? getLastStack().pop() : null;

            if ( element != null && getLastStack().isEmpty() ) {
                stacks.remove( stacks.size() - 1 );
            }

            return element;
        }

        public boolean push( E element ) {
            if ( !getLastStack().push( element ) ) {
                LinkedStack<E> stack = new LinkedStack<>( threshold );
                stack.push( element );
                stacks.add( stack );
            }

            return true;
        }

        public E getAt( int index ) {
            if ( stacks.isEmpty() || index < 0 || index >= ( ( stacks.size() - 1 ) * threshold + getLastStack().size() ) ) {
                return null;
            }

            LinkedStack<E> stack = stacks.get( ( index / threshold ) - 1 );
            int nodesFromTop = stack.size() - ( index % threshold );

            for ( E element : stack ) {
                if ( --nodesFromTop == 0 ) {
                    return element;
                }
            }

            return null;
        }

        private LinkedStack<E> getLastStack() {
            return !stacks.isEmpty() ? stacks.get( stacks.size() - 1 ) : null;
        }

        int threshold;
        ArrayList<LinkedStack<E>> stacks = new ArrayList<>();
    }
}
