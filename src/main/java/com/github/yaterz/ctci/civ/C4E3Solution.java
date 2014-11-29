package com.github.yaterz.ctci.civ;

import java.util.List;

/**
 * Given a sorted (increasing order) array of unique integers, create a binary search tree with minimal height
 *
 * @author mattyaterz
 * @since 11/28/14
 */
public class C4E3Solution {
    public static BinaryTreeNode<Integer> getTreeFromSortedList( List<Integer> sortedList ) {
        if ( sortedList == null || sortedList.isEmpty() ) {
            return null;
        }

        int size = sortedList.size();
        int median = size / 2;

        switch ( size ) {
            case 1: return new BinaryTreeNode<>( sortedList.get( 0 ) );
            case 2: return new BinaryTreeNode<>( sortedList.get( median ),
                            getTreeFromSortedList( sortedList.subList( 0, median ) ),
                            null );
            default: return new BinaryTreeNode<>( sortedList.get( median ),
                            getTreeFromSortedList( sortedList.subList( 0, median ) ),
                            getTreeFromSortedList( sortedList.subList( median + 1, size ) )
            );
        }
    }
}
