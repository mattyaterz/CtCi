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
 * @since 11/7/14
 */
@RunWith( Parameterized.class ) public class C1E8Test {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
            new Object[] { null, null, false },
            new Object[] { "", "", true },
            new Object[] { "waterbottle", "erbottlewat", true },
            new Object[] { "erbottlewat", "waterbottle", true }
        );
    }

    public C1E8Test( String s1, String s2, boolean isRotation ) {
        this.s1 = s1;
        this.s2 = s2;
        this.isRotation = isRotation;
    }

    @Test public void testRotation() {
        Assert.assertEquals( isRotation, C1E8Solution.isRotation( s1, s2 ) );
    }

    String s1;
    String s2;
    boolean isRotation;
}
