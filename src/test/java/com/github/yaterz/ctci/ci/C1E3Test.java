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
@RunWith( Parameterized.class )public class C1E3Test {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
                new Object[] { "The Quick Brown Fox Jumps Over The Lazy Dog", "The Quick Brown Fox Jumps Over The Lazy Dog", true },
                new Object[] { "The Quick Brown Fox Jumps Over The Lazy Dog", "The Lazy Dog Jumps Over The Quick Brown Fox", true },
                new Object[] { "god", "dog", true },
                new Object[] { "God", "Dog", false },
                new Object[] { "dog", "GOD", false },
                new Object[] { " g o d ", "d o g", false },
                new Object[] { "god?", "dog!", false },
                new Object[] { null, "test", false },
                new Object[] { null, null, false },
                new Object[] { "", "", true }
        );
    }

    public C1E3Test( String first, String second, boolean isPermutation ) {
        this.first = first;
        this.second = second;
        this.isPermutation = isPermutation;
    }

    @Test public void testIsPermutation() {
        Assert.assertEquals( isPermutation, C1E3Solution.isPermutation( first, second ) );
        Assert.assertEquals( isPermutation, C1E3Solution.isPermutation( second, first ) );
    }

    String first;
    String second;
    boolean isPermutation;
}
