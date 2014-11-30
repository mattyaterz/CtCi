package com.github.yaterz.ctci.civ;

/**
 * Find the 'next' node (in-order successor) of a given node in a BST
 * The tree nodes can have a link to their parent
 *
 * @author mattyaterz
 * @since 11/29/14
 */
public class C4E6Solution {
    public static <E> ParentLinkedBinaryTreeNode<E> getNextNode( ParentLinkedBinaryTreeNode<E> node ) {
        return getNext( node, null );
    }

    private static <E> ParentLinkedBinaryTreeNode<E> getNext( ParentLinkedBinaryTreeNode<E> current,
                                                              ParentLinkedBinaryTreeNode<E> previous ) {
        if ( current == null ) {
            return null;
        }

        if ( current.right != previous ) {
            return getMin( current.right );
        }

        return getNext( current.parent, current );
    }

    private static <E> ParentLinkedBinaryTreeNode<E> getMin( ParentLinkedBinaryTreeNode<E> node ) {
        if ( node.left == null ) {
            return node;
        }

        return getMin( node.left );
    }

    private static class ParentLinkedBinaryTreeNode<E> {
        public ParentLinkedBinaryTreeNode( E element, ParentLinkedBinaryTreeNode<E> parent ) {
            this.element = element;
            this.parent = parent;
        }

        public ParentLinkedBinaryTreeNode( E element, ParentLinkedBinaryTreeNode<E> parent,
                                           ParentLinkedBinaryTreeNode<E> left,
                                           ParentLinkedBinaryTreeNode<E> right ) {
            this.element = element;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public E element;
        public ParentLinkedBinaryTreeNode<E> parent;
        public ParentLinkedBinaryTreeNode<E> left;
        public ParentLinkedBinaryTreeNode<E> right;
    }
}
