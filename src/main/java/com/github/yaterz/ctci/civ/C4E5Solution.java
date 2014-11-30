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

        if ( root.left != null) {
            if ( root.left.element.compareTo( root.element ) >= 0 ) {
                return false;
            }

            if ( getMax( root.left ).compareTo( root.element ) >= 0 ) {
                return false;
            }
        }

        if ( root.right != null ) {
            if ( root.element.compareTo( root.right.element ) > 0 ) {
                return false;
            }

            if ( root.element.compareTo( getMin( root.right ) ) > 0 ) {
                return false;
            }
        }

        return isBinarySearchTree( root.left ) && isBinarySearchTree( root.right );
    }

    private static <E extends Comparable<E>> E getMax( BinaryTreeNode<E> root ) {
        if ( root.right == null ) {
            return root.element;
        }

        return getMax( root.right );
    }

    private static <E extends Comparable<E>> E getMin( BinaryTreeNode<E> root ) {
        if ( root.left == null ) {
            return root.element;
        }

        return getMin( root.left );
    }
}
