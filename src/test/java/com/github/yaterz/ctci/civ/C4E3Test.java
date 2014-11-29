package com.github.yaterz.ctci.civ;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

import static com.github.yaterz.ctci.civ.C4E3Solution.getTreeFromSortedList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author mattyaterz
 * @since 11/28/14
 */
public class C4E3Test {
    @Test public void testNull() {
        assertNull( getTreeFromSortedList( null ) );
    }

    @Test public void testEmpty() {
        assertNull( getTreeFromSortedList( new ArrayList<Integer>() ) );
    }

    @Test public void testOne() {
        BinaryTreeNode<Integer> root = getTreeFromSortedList( Arrays.asList( 1 ) );
        assertEquals( 1,  (int)root.element );
        assertNull( root.left );
        assertNull( root.right );
    }

    @Test public void testTwo() {
        BinaryTreeNode<Integer> root = getTreeFromSortedList( Arrays.asList( 1, 2 ) );
        assertEquals( 2, (int)root.element );
        assertEquals( 1, (int)root.left.element );
        assertNull( root.left.left );
        assertNull( root.left.right );
        assertNull( root.right );
    }

    @Test public void testThree() {
        BinaryTreeNode<Integer> root = getTreeFromSortedList( Arrays.asList( 1, 2, 3 ) );
        assertEquals( 2,  (int)root.element );
        assertEquals( 1, (int)root.left.element );
        assertNull( root.left.left );
        assertNull( root.left.right );
        assertEquals( 3, (int)root.right.element );
        assertNull( root.right.left );
        assertNull( root.right.right );
    }

    @Test public void testSeven() {
        BinaryTreeNode<Integer> root = getTreeFromSortedList( Arrays.asList( 1, 2, 3, 4, 5, 6, 7 ) );
        assertEquals( 4,  (int)root.element );
        assertEquals( 2, (int)root.left.element );
        assertEquals( 1, (int)root.left.left.element );
        assertNull( root.left.left.left );
        assertNull( root.left.left.right );
        assertEquals( 3, (int)root.left.right.element );
        assertNull( root.left.right.left );
        assertNull( root.left.right.right );
        assertEquals( 6, (int)root.right.element );
        assertEquals( 5, (int)root.right.left.element );
        assertNull( root.right.left.left );
        assertNull( root.right.left.right );
        assertEquals( 7, (int)root.right.right.element );
        assertNull( root.right.right.left );
        assertNull( root.right.right.right );
    }
}
