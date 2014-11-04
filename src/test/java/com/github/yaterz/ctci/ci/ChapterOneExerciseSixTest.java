package com.github.yaterz.ctci.ci;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author mattyaterz
 * @since 11/2/14
 */
@RunWith( Parameterized.class ) public class ChapterOneExerciseSixTest {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
                new Object[] {
                        new int[][] {
                                { 1, 1 },
                                { 2, 2 }
                        },
                        new int[][] {
                                { 2, 1 },
                                { 2, 1 }
                        },
                        true
                },
                new Object[] {
                        new int[][] {
                                { 3, 2, 1 },
                                { 3, 2, 1 },
                                { 3, 2, 1 }
                        },
                        new int[][] {
                                { 3, 3, 3 },
                                { 2, 2, 2 },
                                { 1, 1, 1 }
                        },
                        true
                },
                new Object[] {
                        new int[][] {
                                { 5, 5, 5, 5, 5 },
                                { 4, 4, 4, 4, 4 },
                                { 3, 3, 3, 3, 3 },
                                { 2, 2, 2, 2, 2 },
                                { 1, 1, 1, 1, 1 }
                        },
                        new int[][] {
                                { 1, 2, 3, 4, 5 },
                                { 1, 2, 3, 4, 5 },
                                { 1, 2, 3, 4, 5 },
                                { 1, 2, 3, 4, 5 },
                                { 1, 2, 3, 4, 5 }
                        },
                        true
                },
                new Object[] {
                        new int[][] {
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 }
                        },
                        new int[][] {
                                { 1, 1, 1, 1, 1, 1, 1, 1 },
                                { 2, 2, 2, 2, 2, 2, 2, 2 },
                                { 3, 3, 3, 3, 3, 3, 3, 3 },
                                { 4, 4, 4, 4, 4, 4, 4, 4 },
                                { 5, 5, 5, 5, 5, 5, 5, 5 },
                                { 6, 6, 6, 6, 6, 6, 6, 6 },
                                { 7, 7, 7, 7, 7, 7, 7, 7 },
                                { 8, 8, 8, 8, 8, 8, 8, 8 }
                        },
                        true
                },
                new Object[] {
                        new int[][] {
                                { 1, 1 },
                                { 2, 2 }
                        },
                        new int[][] {
                                { 1, 2 },
                                { 1, 2 }
                        },
                        false
                },
                new Object[] {
                        new int[][] {
                                { 3, 2, 1 },
                                { 3, 2, 1 },
                                { 3, 2, 1 }
                        },
                        new int[][] {
                                { 1, 1, 1 },
                                { 2, 2, 2 },
                                { 3, 3, 3 }
                        },
                        false
                },
                new Object[] {
                        new int[][] {
                                { 5, 5, 5, 5, 5 },
                                { 4, 4, 4, 4, 4 },
                                { 3, 3, 3, 3, 3 },
                                { 2, 2, 2, 2, 2 },
                                { 1, 1, 1, 1, 1 }
                        },
                        new int[][] {
                                { 5, 4, 3, 2, 1 },
                                { 5, 4, 3, 2, 1 },
                                { 5, 4, 3, 2, 1 },
                                { 5, 4, 3, 2, 1 },
                                { 5, 4, 3, 2, 1 }
                        },
                        false
                },
                new Object[] {
                        new int[][] {
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 },
                                { 1, 2, 3, 4, 5, 6, 7, 8 }
                        },
                        new int[][] {
                                { 8, 8, 8, 8, 8, 8, 8, 8 },
                                { 7, 7, 7, 7, 7, 7, 7, 7 },
                                { 6, 6, 6, 6, 6, 6, 6, 6 },
                                { 5, 5, 5, 5, 5, 5, 5, 5 },
                                { 4, 4, 4, 4, 4, 4, 4, 4 },
                                { 3, 3, 3, 3, 3, 3, 3, 3 },
                                { 2, 2, 2, 2, 2, 2, 2, 2 },
                                { 1, 1, 1, 1, 1, 1, 1, 1 }
                        },
                        false
                }
        );
    }

    public ChapterOneExerciseSixTest( int[][] startMatrix, int[][] rotatedMatrix, boolean rotateRight ) {
        this.startMatrix = startMatrix;
        this.rotatedMatrix = rotatedMatrix;
        this.rotateRight = rotateRight;
    }

    @Test public void testRotateMatrixRight() {
        ChapterOneExerciseSixSolution.rotateNinety( startMatrix, rotateRight );

        for ( int row = 0; row < startMatrix.length; row++ ) {
            Assert.assertArrayEquals( rotatedMatrix[ row ], startMatrix[ row ] );
        }
    }

    int[][] startMatrix;
    int[][] rotatedMatrix;
    boolean rotateRight;
}
