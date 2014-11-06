package com.github.yaterz.ctci.ci;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0
 *
 * @author mattyaterz
 * @since 11/5/14
 */
public class ChapterOneExerciseSevenSolution {
    public static void matrixNullifier( int[][] matrix ) {
        if ( matrix == null || matrix.length == 0 || matrix[0].length == 0 ) {
            return;
        }

        boolean[] nullRows = new boolean[ matrix.length ];
        boolean[] nullColumns = new boolean[ matrix[0].length ];

        for ( int row = 0; row < matrix.length; row++ ) {
            for ( int column = 0; column < matrix[0].length; column++ ) {
                if ( matrix[ row ][ column ] == 0 ) {
                    nullRows[ row ] = true;
                    nullColumns[ column ] = true;
                }
            }
        }

        for ( int row = 0; row < nullRows.length; row++ ) {
            if ( nullRows[ row ] ) {
                for ( int column = 0; column < matrix[0].length; column++ ) {
                    matrix[ row ][ column ] = 0;
                }
            }
        }

        for ( int column = 0; column < nullColumns.length; column++ ) {
            if ( nullColumns[ column ] ) {
                for ( int row = 0; row < matrix.length; row++ ) {
                    matrix[ row ][ column ] = 0;
                }
            }
        }
    }
}
