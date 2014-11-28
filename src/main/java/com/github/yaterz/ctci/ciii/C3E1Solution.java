package com.github.yaterz.ctci.ciii;

import java.util.Arrays;

/**
 * Use a single array to implement three stacks
 *
 * @author mattyaterz
 * @since 11/20/14
 */
public class C3E1Solution {

    public static class MultiStack<E> {
        public MultiStack( int totalSize ) {
            this.array = getGenericArray( totalSize );
            this.stacks = new MetaStack[ 3 ]; // could be customized

            for ( int i = 0; i < stacks.length; i++ ) {
                this.stacks[ i ] = new MetaStack();
            }
        }

        public boolean push( int stackIndex, E element ) {
            if ( stackIndex < 0 || stackIndex >= stacks.length || element == null ) {
                return false;
            }

            MetaStack stack = stacks[ stackIndex ];

            if ( array[ stack.top ] == null ) { // empty stack case
                array[ stack.top ] = element;
                stack.depth++;
                return true;
            }

            int nextIndex = getNextIndex( stack.top );

            if ( array[ nextIndex ] == null ) { // room to grow current stack
                if ( nextIndex < stack.top ) {
                    stack.isWrapped = true;
                }
            }
            else { // next index is occupied
                shiftStack( getStackFromArrayIndex( nextIndex ) );
            }

            array[ nextIndex ] = element;
            stack.top = nextIndex;
            stack.depth++;
            return true;
        }

        public E pop( int stackIndex ) {
            if ( stackIndex < 0 || stackIndex >= stacks.length ) {
                return null;
            }

            MetaStack stack = stacks[ stackIndex ];
            E element = array[ stack.top ];
            array[ stack.top ] = null;
            stack.top--;

            if ( stack.top < 0 ) {
                stack.top = array.length - 1;
                stack.isWrapped = false;
            }

            stack.depth--;
            return element;
        }

        /**
         *
         * @return the number of elements in all of the stacks
         */
        private int getTotalSize() {
            int size = 0;

            for( MetaStack stack : stacks ) {
                size += stack.depth;
            }

            return size;
        }

        /**
         *
         * @param stack the stack to move over 1 position in the element array
         * @return
         */
        private boolean shiftStack( MetaStack stack ) {
            if ( getTotalSize() == array.length ) {
                return false;
            }

            if ( array[ getNextIndex( stack.top ) ] != null ) { // need to move the next stack over before we can move this one
                shiftStack( getStackFromArrayIndex( getNextIndex( stack.top ) ) );
            }

            if ( stack.isWrapped ) { // have to move the elements in two pieces because the indexes of the elements of the stack bridge the end of the element array
                System.arraycopy( array, 0, array, 1, stack.top + 1 );

                for ( int i = array.length - 1; i >= getBottomIndex( stack ); i-- ) {
                    array[ getNextIndex( i ) ] = array[ i ];
                }

                if ( getNextIndex( getBottomIndex( stack ) ) == 0 ) { // if the last element moved to index 0, the stack is no longer wrapped
                    stack.isWrapped = false;
                }
            }
            else {
                if ( getNextIndex( stack.top ) < stack.top ) { // if the top of the stack will move to index 0, the stack is now wrapped
                    for ( int i = stack.top; i >= getBottomIndex( stack ); i-- ) {
                        array[ getNextIndex( i ) ] = array[ i ];
                    }

                    stack.isWrapped = true;
                }
                else {
                    System.arraycopy( array, getBottomIndex( stack ), array, getBottomIndex( stack ) + 1, stack.depth );
                }
            }

            array[ getBottomIndex( stack ) ] = null; // very important!
            stack.top++;
            return true;
        }

        /**
         *
         * @param stack
         * @return
         */
        private int getBottomIndex( MetaStack stack ) {
            return stack.isWrapped ? array.length - stack.depth + stack.top - 1 : stack.top - stack.depth + 1;
        }

        private MetaStack getStackFromArrayIndex( int arrayIndex ) {
            for ( MetaStack stack : stacks ) {
                if ( stack.isWrapped ) {
                    if ( arrayIndex <= stack.top ) {
                        return stack;
                    }

                    if ( arrayIndex >= getBottomIndex( stack ) ) {
                        return stack;
                    }
                }
                else if ( arrayIndex <= stack.top && arrayIndex >= getBottomIndex( stack ) ) {
                    return stack;
                }
            }

            return null;
        }

        private int getNextIndex( int arrayIndex ) {
            return ++arrayIndex >= array.length ? 0 : arrayIndex;
        }

        @SafeVarargs private final E[] getGenericArray( int length, E... array ) {
            return Arrays.copyOf( array, length );
        }

        E[] array;
        MetaStack[] stacks;

        private static class MetaStack {
            public int top = 0;
            public int depth = 0;
            public boolean isWrapped = false;
        }
    }
}
