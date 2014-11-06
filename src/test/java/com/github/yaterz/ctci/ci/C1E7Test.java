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
 * @since 11/5/14
 */
@RunWith( Parameterized.class ) public class C1E7Test {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
            new Object[] {
                new int[][] {
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 }
                },
                new int[][] {
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 }
                }
            },
            new Object[] {
                new int[][] {
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0 }
                },
                new int[][] {
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0 }
                }
            },
            new Object[] {
                new int[][] {
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 0, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 }
                },
                new int[][] {
                    { 1, 1, 0, 1, 1 },
                    { 1, 1, 0, 1, 1 },
                    { 0, 0, 0, 0, 0 },
                    { 1, 1, 0, 1, 1 },
                    { 1, 1, 0, 1, 1 }
                }
            },
            new Object[] {
                new int[][] {
                    { 0, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 }
                },
                new int[][] {
                    { 0, 0, 0, 0, 0 },
                    { 0, 1, 1, 1, 1 },
                    { 0, 1, 1, 1, 1 },
                    { 0, 1, 1, 1, 1 },
                    { 0, 1, 1, 1, 1 }
                }
            },
            new Object[] {
                new int[][] {
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 0, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 }
                },
                new int[][] {
                    { 1, 1, 1, 0, 1 },
                    { 0, 0, 0, 0, 0 },
                    { 1, 1, 1, 0, 1 },
                    { 1, 1, 1, 0, 1 },
                    { 1, 1, 1, 0, 1 }
                }
            },
            new Object[] {
                new int[][] {
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 0, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 }
                },
                new int[][] {
                    { 1, 0, 1, 1, 1 },
                    { 1, 0, 1, 1, 1 },
                    { 1, 0, 1, 1, 1 },
                    { 0, 0, 0, 0, 0 },
                    { 1, 0, 1, 1, 1 }
                }
            },
            new Object[] {
                new int[][] {
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 0 }
                },
                new int[][] {
                    { 1, 1, 1, 1, 0 },
                    { 1, 1, 1, 1, 0 },
                    { 1, 1, 1, 1, 0 },
                    { 1, 1, 1, 1, 0 },
                    { 0, 0, 0, 0, 0 }
                }
            },
            new Object[] {
                new int[][] {
                    { 1, 0, 1, 1, 1 },
                    { 0, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 0 },
                    { 1, 1, 1, 0, 1 }
                },
                new int[][] {
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 1, 0, 0 },
                    { 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0 }
                },
            },
            new Object[] {
                new int[][] {
                    { 0, 1, 0, 1, 0 },
                    { 1, 1, 1, 1, 1 },
                    { 0, 1, 1, 1, 0 },
                    { 1, 1, 1, 1, 1 },
                    { 0, 1, 0, 1, 0 }
                },
                new int[][] {
                    { 0, 0, 0, 0, 0 },
                    { 0, 1, 0, 1, 0 },
                    { 0, 0, 0, 0, 0 },
                    { 0, 1, 0, 1, 0 },
                    { 0, 0, 0, 0, 0 }
                },
            },
            new Object[] {
                new int[][] {
                    { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1 },
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                    { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1 }
                },
                new int[][] {
                    { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                    { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1 },
                    { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1 },
                    { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1 },
                    { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
                },
            }
        );
    }

    public C1E7Test( int[][] input, int[][] output ) {
        this.input = input;
        this.output = output;
    }

    @Test public void testMatrixNullifier() {
        C1E7Solution.matrixNullifier( input );

        for ( int i = 0; i < output.length; i++ ) {
            Assert.assertArrayEquals( output[i], input[i] );
        }
    }

    int[][] input;
    int[][] output;
}
