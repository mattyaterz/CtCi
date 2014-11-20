package com.github.yaterz.ctci.cii;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static com.github.yaterz.ctci.cii.C2TestUtils.asLinkedList;
import static org.junit.Assert.assertEquals;

/**
 * @author mattyaterz
 * @since 11/19/14
 */
@RunWith( Parameterized.class ) public class C2E7Test {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
            new Object[] { null, false },
            new Object[] { asLinkedList( 1 ), true },
            new Object[] { asLinkedList( 1, 2, 3, 4, 5, 6, 7, 8, 9 ), false },
            new Object[] { asLinkedList( 9, 8, 7, 6, 5, 4, 3, 2, 1 ), false },
            new Object[] { asLinkedList( 1, 2, 3, 4, 5, 4, 3, 2, 1 ), true },
            new Object[] { asLinkedList( 1, 2, 9, 0, 8, 8, 0, 9, 2, 1 ), true }
        );
    }

    public C2E7Test( SingleLinkedNode node, boolean isPalindrome ) {
        this.node = node;
        this.isPalindrome = isPalindrome;
    }

    @Test public void testIsPalindrome() {
        assertEquals( isPalindrome, C2E7Solution.isPalindrome( node ) );
    }

    SingleLinkedNode node;
    boolean isPalindrome;
}
