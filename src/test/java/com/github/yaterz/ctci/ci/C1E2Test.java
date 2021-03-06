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
@RunWith( Parameterized.class ) public class C1E2Test {
    @Parameters public static Collection<String[]> testData() {
        return Arrays.asList(
                new String[] { "abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba" },
                new String[] { "", "" },
                new String[] { null, null }
        );
    }

    public C1E2Test( String str, String reversedStr ) {
        this.str = str != null ? str.toCharArray() : null;
        this.reversedStr = reversedStr != null ? reversedStr.toCharArray() : null;
    }

    @Test public void testForRepeatedCharacters() {
        C1E2Solution.reverseString( str );
        Assert.assertArrayEquals( reversedStr, str );
    }

    char[] str;
    char[] reversedStr;
}
