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
@RunWith( Parameterized.class ) public class C1E4Test {
    @Parameters public static Collection<String[]> testData() {
        return Arrays.asList(
                new String[] { "Mr John Smith\0\0\0\0", "Mr%20John%20Smith" },
                new String[] { " test \0\0\0\0", "%20test%20" },
                new String[] { "testNoSpaces", "testNoSpaces" },
                new String[] { "", "" },
                new String[] { null, null }
        );
    }

    public C1E4Test( String regularSpaces, String urlEncodedSpaces ) {
        this.regularSpaces = regularSpaces != null ? regularSpaces.toCharArray() : null;
        this.urlEncodedSpaces = urlEncodedSpaces != null ? urlEncodedSpaces.toCharArray() : null;
    }

    @Test public void testSpaceEncoding() {
        C1E4Solution.urlEncodeSpaces( regularSpaces );
        Assert.assertArrayEquals( urlEncodedSpaces, regularSpaces );
    }

    char[] regularSpaces;
    char[] urlEncodedSpaces;
}
