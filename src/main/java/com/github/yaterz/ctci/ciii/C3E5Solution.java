package com.github.yaterz.ctci.ciii;

/**
 * Implement a Queue using two Stacks
 *
 * @author mattyaterz
 * @since 11/23/14
 */
public class C3E5Solution {
    public static class StackedQueue<E> {
        public boolean offer( E element ) {
            last.push( element );
            first.clear();

            for ( E item : last ) {
                first.push( item );
            }

            return true;
        }

        public E poll() {
            E element = first.pop();
            last.clear();

            for ( E item : first ) {
                last.push( item );
            }

            return element;
        }

        public E peek() {
            return first.peek();
        }

        public int size() {
            return last.size();
        }

        public boolean isEmpty() {
            return size() == 0;
        }

        LinkedStack<E> last = new LinkedStack<>();
        LinkedStack<E> first = new LinkedStack<>();
    }
}
