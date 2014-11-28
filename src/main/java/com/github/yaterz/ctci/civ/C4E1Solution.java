package com.github.yaterz.ctci.civ;

/**
 * Implement a function to check if a tree is balanced,
 * defined as the heights of any two subtree of any node not differing by more than one.
 *
 * @author mattyaterz
 * @since 11/28/14
 */
public class C4E1Solution {
    public static boolean isBalanced( BinaryTreeNode<?> root ) {
        return getHeightIfBalanced( root, 1 ) >= 0;
    }

    private static int getHeightIfBalanced( BinaryTreeNode<?> root, int balanceThreshold ) {
        if ( root == null ) {
            return 0;
        }

        int leftHeight = getHeightIfBalanced( root.left, balanceThreshold );

        if ( leftHeight < 0 ) {
            return -1;
        }

        int rightHeight = getHeightIfBalanced( root.right, balanceThreshold );

        if ( rightHeight < 0 ) {
            return -1;
        }

        if ( Math.abs( leftHeight - rightHeight ) > balanceThreshold ) {
            return -1;
        }

        return Math.max( leftHeight, rightHeight ) + 1;
    }
}
