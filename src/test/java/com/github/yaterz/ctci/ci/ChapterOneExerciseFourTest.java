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
@RunWith( Parameterized.class ) public class ChapterOneExerciseFourTest {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
                new Object[] { "Mr John Smith\0\0\0\0".toCharArray(), "Mr%20John%20Smith".toCharArray() },
                new Object[] { " test \0\0\0\0".toCharArray(), "%20test%20".toCharArray() },
                new Object[] { "testNoSpaces".toCharArray(), "testNoSpaces".toCharArray() },
                new Object[] { new char[0], new char[0] },
                new Object[] { null, null }
        );
    }

    public ChapterOneExerciseFourTest( char[] regularSpaces, char[] urlEncodedSpaces ) {
        this.regularSpaces = regularSpaces;
        this.urlEncodedSpaces = urlEncodedSpaces;
    }

    @Test public void testSpaceEncoding() {
        ChapterOneExerciseFourSolution.urlEncodeSpaces( regularSpaces );
        Assert.assertArrayEquals( urlEncodedSpaces, regularSpaces );
    }

    char[] regularSpaces;
    char[] urlEncodedSpaces;
}
