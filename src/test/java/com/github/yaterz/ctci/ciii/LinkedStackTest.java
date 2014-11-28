package com.github.yaterz.ctci.ciii;

import java.util.Iterator;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mattyaterz
 * @since 11/27/14
 */
public class LinkedStackTest {
    @Test public void testEverything() {
        LinkedStack<Integer> stack = new LinkedStack<>( 8 );
        assertEquals( 8, stack.limit() );
        assertTrue( stack.isEmpty() );
        assertEquals( 0, stack.size() );
        assertNull( stack.pop() );
        assertNull( stack.peek() );

        for ( int i = 0; i < stack.limit(); i++ ) {
            assertTrue( stack.push( i ) );
            assertEquals( i, (int)stack.peek() );
            assertEquals( i + 1, stack.size() );
            assertFalse( stack.isEmpty() );
            assertEquals( 8, stack.limit() );
        }

        assertEquals( stack.limit(), stack.size() );
        assertFalse( stack.push( 9 ) );

        for ( int i = stack.limit() - 1; i >= 0; i-- ) {
            assertFalse( stack.isEmpty() );
            assertEquals( i, (int)stack.peek() );
            assertEquals( stack.peek(), stack.pop() );
            assertEquals( i, stack.size() );
            assertEquals( 8, stack.limit() );
        }

        assertTrue( stack.isEmpty() );
        assertNull( stack.peek() );
        assertNull( stack.pop() );

        for ( int i = 0; i < stack.limit(); i++ ) {
            stack.push( i );
        }

        int next = stack.limit() - 1;
        int size = stack.size();
        Iterator<Integer> it = stack.iterator();

        while ( it.hasNext() ) {
            it.remove(); // no op
            assertEquals( size, stack.size() );
            assertEquals( next--, (int)it.next() );
            it.remove();
            assertEquals( --size, stack.size() );
        }

        assertTrue( stack.isEmpty() );
        assertNull( stack.peek() );
        assertNull( stack.pop() );

        for ( int i = 0; i < stack.limit(); i++ ) {
            stack.push( i );
        }

        it = stack.iterator();

        while ( it.hasNext() ) {
            if ( it.next() % 2 == 0 ) {
                it.remove();
            }
        }

        assertEquals( 4, stack.size() );
        next = 7;

        for ( Integer i : stack ) {
            assertEquals( next, (int)i );
            next -= 2;
        }

        assertEquals( 4, stack.size() );
        assertTrue( stack.clear() );
        assertEquals( 0, stack.size() );
        assertTrue( stack.isEmpty() );
        assertNull( stack.peek() );
        assertNull( stack.pop() );
    }
}
