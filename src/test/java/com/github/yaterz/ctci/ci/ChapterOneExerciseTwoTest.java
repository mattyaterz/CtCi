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
@RunWith( Parameterized.class ) public class ChapterOneExerciseTwoTest {
    @Parameters public static Collection<Object[]> testCases() {
        return Arrays.asList(
                new Object[] { "abcdefghijklmnopqrstuvwxyz".toCharArray(), "zyxwvutsrqponmlkjihgfedcba".toCharArray() },
                new Object[] { new char[0], new char[0] },
                new Object[] { null, null }
        );
    }

    public ChapterOneExerciseTwoTest( char[] str, char[] reversedStr ) {
        this.str = str;
        this.reversedStr = reversedStr;
    }

    @Test public void testForRepeatedCharacters() {
        ChapterOneExerciseTwoSolution.reverseString( str );
        Assert.assertArrayEquals( reversedStr, str );
    }

    char[] str;
    char[] reversedStr;
}
