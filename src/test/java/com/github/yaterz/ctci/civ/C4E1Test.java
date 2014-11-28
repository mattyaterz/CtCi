package com.github.yaterz.ctci.civ;

import org.junit.Test;

import static com.github.yaterz.ctci.civ.C4E1Solution.isBalanced;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author mattyaterz
 * @since 11/28/14
 */
public class C4E1Test {

    @Test public void testNull() {
        assertTrue( isBalanced( null ) );
    }

    @Test public void testPerfectlyBalanced() {
        BinaryTreeNode<Integer> root =
        new BinaryTreeNode<>( 8,
            new BinaryTreeNode<>( 4,
                new BinaryTreeNode<>( 2 ),
                new BinaryTreeNode<>( 6 )
            ),
            new BinaryTreeNode<>( 12,
                new BinaryTreeNode<>( 10 ),
                new BinaryTreeNode<>( 14 )
            )
        );

        assertTrue( isBalanced( root ) );
    }

    @Test public void testLeftToRightCascade() {
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

        assertTrue( isBalanced( root ) );
    }

    @Test public void testRightToLeftCascase() {
        BinaryTreeNode<Integer> root =
        new BinaryTreeNode<>( 16,
            new BinaryTreeNode<>( 8,
                new BinaryTreeNode<>( 4,
                    new BinaryTreeNode<>( 2,
                        new BinaryTreeNode<>( 1 ),
                        new BinaryTreeNode<>( 3 )
                    ),
                    new BinaryTreeNode<>( 6,
                        new BinaryTreeNode<>( 5 ),
                        new BinaryTreeNode<>( 7 )
                    )
                ),
                new BinaryTreeNode<>( 12,
                    new BinaryTreeNode<>( 10 ),
                    new BinaryTreeNode<>( 14 )
                )
            ),
            new BinaryTreeNode<>( 20,
                new BinaryTreeNode<>( 18 ),
                new BinaryTreeNode<>( 22,
                    new BinaryTreeNode<>( 21 ),
                    new BinaryTreeNode<>( 23 )
                )
            )
        );

        assertTrue( isBalanced( root ) );
    }

    @Test public void testLeftOnly() {
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

        assertFalse( isBalanced( root ) );
    }

    @Test public void testRightOnly() {
        BinaryTreeNode<Integer> root =
        new BinaryTreeNode<>( 8,
          null,
          new BinaryTreeNode<>( 12,
            null,
            new BinaryTreeNode<>( 14,
              null,
              new BinaryTreeNode<>( 15 )
            )
          )
        );

        assertFalse( isBalanced( root ) );
    }
}
