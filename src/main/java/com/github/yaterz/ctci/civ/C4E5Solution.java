package com.github.yaterz.ctci.civ;

/**
 * Determine if a binary tree is a binary search tree
 *
 * @author mattyaterz
 * @since 11/29/14
 */
public class C4E5Solution {
    public static <E extends Comparable<E>> boolean isBinarySearchTree( BinaryTreeNode<E> root ) {
        if ( root == null ) {
            return true;
        }

        if ( root.left != null && root.left.element.compareTo( root.element ) > 0 ) {
            return false;
        }

        if ( root.right != null && root.element.compareTo( root.right.element ) > 0 ) {
            return false;
        }

        return isBinarySearchTree( root.left ) && isBinarySearchTree( root.right );
    }
}
