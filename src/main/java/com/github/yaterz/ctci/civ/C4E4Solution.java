package com.github.yaterz.ctci.civ;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, design an algorithm which creates a linked list of all the nodes at each depth
 *
 * @author mattyaterz
 * @since 11/28/14
 */
public class C4E4Solution {
    public static <E> List<LinkedList<BinaryTreeNode<E>>> getLevelsDFS( BinaryTreeNode<E> root ) {
        List<LinkedList<BinaryTreeNode<E>>> levels = new LinkedList<>();
        buildLevels( levels, root, 0 );
        return levels;
    }

    public static <E> List<LinkedList<BinaryTreeNode<E>>> getLevelsBFS( BinaryTreeNode<E> root ) {
        List<LinkedList<BinaryTreeNode<E>>> levels = new LinkedList<>();

        if ( root == null ) {
            return levels;
        }

        Queue<BinaryTreeNode<E>> queue = new LinkedList<>();
        queue.offer( root );
        int depth = 0;

        while ( !queue.isEmpty() ) {
            BinaryTreeNode<E> current = queue.poll();

            if ( levels.size() == depth ) {
                levels.add( new LinkedList<BinaryTreeNode<E>>() );
            }

            levels.get( depth ).add( current );

            if ( current.left != null ) {
                queue.offer( current.left );
            }

            if ( current.right != null ) {
                queue.offer( current.right );
            }

            if ( queue.size() == Math.pow( 2, levels.size() ) ) {
                depth++;
            }
        }

        return levels;
    }

    private static <E> void buildLevels(
            List<LinkedList<BinaryTreeNode<E>>> lists, BinaryTreeNode<E> root, int depth ) {

        if ( root == null ) {
            return;
        }

        if ( lists.size() == depth ) {
            lists.add( new LinkedList<BinaryTreeNode<E>>() );
        }

        lists.get( depth ).add( root );
        buildLevels( lists, root.left, depth + 1 );
        buildLevels( lists, root.right, depth + 1 );
    }
}
