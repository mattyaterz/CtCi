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
                        }
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
                        }
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
                        }
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
                        }
                }
        );
    }

    public ChapterOneExerciseSixTest( int[][] startMatrix, int[][] rotatedMatrix ) {
        this.startMatrix = startMatrix;
        this.rotatedMatrix = rotatedMatrix;
    }

    @Test public void testRotateMatrixRight() {
        ChapterOneExerciseSixSolution.rotateRightNinety( startMatrix );

        for ( int row = 0; row < startMatrix.length; row++ ) {
            Assert.assertArrayEquals( rotatedMatrix[ row ], startMatrix[ row ] );
        }
    }

    int[][] startMatrix;
    int[][] rotatedMatrix;
}
