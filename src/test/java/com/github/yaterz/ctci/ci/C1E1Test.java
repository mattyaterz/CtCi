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
@RunWith( Parameterized.class ) public class C1E1Test {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
                new Object[] { null, false },
                new Object[] { "", false },
                new Object[] { "123abcABCȧḃċÁƁĆ",false },
                new Object[] { "theQuickBrownFOxJUmps0vERTH3LazyD()g", false },
                new Object[] { " s p a c e s ", true },
                new Object[] { "theQuickBrownFoxJumpsOverTheLazyDog", true }
        );
    }

    public C1E1Test( String str, boolean repeatedChars ) {
        this.str = str;
        this.repeatedChars = repeatedChars;
    }

    @Test public void testForRepeatedCharacters() {
        Assert.assertEquals( repeatedChars, C1E1Solution.isAnyCharRepeated( str ) );
    }

    @Test public void testForRepeatedCharactersSort() {
        Assert.assertEquals( repeatedChars, C1E1Solution.isAnyCharRepeatedSort( str ) );
    }

    String str;
    boolean repeatedChars;
}
