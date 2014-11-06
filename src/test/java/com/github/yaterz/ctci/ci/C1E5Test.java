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
@RunWith( Parameterized.class ) public class C1E5Test {
    @Parameters public static Collection<String[]> testData() {
        return Arrays.asList(
                new String[] { "aabcccccaaa", "a2b1c5a3" },
                new String[] { "ABCCDDDEEEEEFFFFFFFFGGGGGGGGGGGGGHHHHHHHHHHHHHHHHHHHHH", "A1B1C2D3E5F8G13H21" },
                new String[] { "TheQuickBrownFoxJumpsOverTheLazyDog", "TheQuickBrownFoxJumpsOverTheLazyDog" },
                new String[] { "", "" },
                new String[] { null, null }
        );
    }

    public C1E5Test( String input, String output ) {
        this.input = input != null ? input.toCharArray() : null;
        this.output = output != null ? output.toCharArray() : null;
    }

    @Test public void testSimpleCompression() {
        Assert.assertArrayEquals( output, C1E5Solution.getRepeatCompressedString( input ) );
    }

    char[] input;
    char[] output;
}
