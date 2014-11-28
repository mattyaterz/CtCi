package com.github.yaterz.ctci.civ;

/**
 * @author mattyaterz
 * @since 11/28/14
 */
public class BinaryTreeNode<E> {
    public BinaryTreeNode() {
    }

    public BinaryTreeNode( E element ) {
        this.element = element;
    }

    public BinaryTreeNode( E element, BinaryTreeNode<E> left, BinaryTreeNode<E> right ) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    E element;
    BinaryTreeNode<E> left;
    BinaryTreeNode<E> right;
}
