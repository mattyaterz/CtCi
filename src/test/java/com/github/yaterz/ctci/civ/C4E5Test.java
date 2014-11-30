package com.github.yaterz.ctci.civ;

import java.util.Arrays;
import org.junit.Test;

import static com.github.yaterz.ctci.civ.C4E3Solution.getTreeFromSortedList;
import static com.github.yaterz.ctci.civ.C4E5Solution.isBinarySearchTree;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author mattyaterz
 * @since 11/29/14
 */
public class C4E5Test {

    @Test public void testNull() {
        assertTrue( isBinarySearchTree( null ) );
    }

    @Test public void testBST() {
        assertTrue( isBinarySearchTree( getTreeFromSortedList( Arrays.asList( 2, 4, 6, 8, 10, 12, 14 ) ) ) );
    }

    @Test public void testBackwardBST() {
        assertFalse( isBinarySearchTree( getTreeFromSortedList( Arrays.asList( 14, 12, 10, 8, 6, 4, 2 ) ) ) );
    }

    @Test public void testLeftSubTreeLargeMax() {
        assertFalse( isBinarySearchTree( getTreeFromSortedList( Arrays.asList( 2, 4, 16, 8, 10, 12, 14 ) ) ) );
    }

    @Test public void testRightSubTreeSmallMin() {
        assertFalse( isBinarySearchTree( getTreeFromSortedList( Arrays.asList( 2, 4, 6, 8, 0, 12, 14 ) ) ) );
    }

    @Test public void testCascadingBST() {
        BinaryTreeNode<Integer> root =
            new BinaryTreeNode<>( 8,
                new BinaryTreeNode<>( 4,
                    new BinaryTreeNode<>( 2 ),
                    new BinaryTreeNode<>( 6,
                        new BinaryTreeNode<>( 5 ),
                        new BinaryTreeNode<>( 7 )
                    )
                ),
                new BinaryTreeNode<>( 16,
                    new BinaryTreeNode<>( 12,
                        new BinaryTreeNode<>( 10 ),
                        new BinaryTreeNode<>( 14 )
                    ),
                    new BinaryTreeNode<>( 20,
                        new BinaryTreeNode<>( 18,
                            new BinaryTreeNode<>( 17 ),
                            new BinaryTreeNode<>( 19 )
                        ),
                        new BinaryTreeNode<>( 22,
                            new BinaryTreeNode<>( 21 ),
                            new BinaryTreeNode<>( 23 )
                        )
                    )
                )
            );

        assertTrue( isBinarySearchTree( root ) );
    }

    @Test public void testUnbalancedBST() {
        BinaryTreeNode<Integer> root =
        new BinaryTreeNode<>( 8,
          new BinaryTreeNode<>( 4,
            new BinaryTreeNode<>( 2,
              new BinaryTreeNode<>( 1 ),
              null
            ),
            null
          ),
          null
        );

        assertTrue( isBinarySearchTree( root ) );
    }
}
