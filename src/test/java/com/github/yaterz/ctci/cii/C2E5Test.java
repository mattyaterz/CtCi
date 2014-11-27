package com.github.yaterz.ctci.cii;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static com.github.yaterz.ctci.cii.C2TestUtils.asArray;
import static com.github.yaterz.ctci.cii.C2TestUtils.asLinkedList;

/**
 * @author mattyaterz
 * @since 11/9/14
 */
@RunWith( Parameterized.class ) public class C2E5Test {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
            new Object[] {
                null, null, new LinkedIntNode( 0 ), new LinkedIntNode( 0 )
            },
            new Object[] {
                null, new LinkedIntNode( 1 ), new LinkedIntNode( 1 ), new LinkedIntNode( 1 )
            },
            new Object[] {
                new LinkedIntNode( 2 ), null, new LinkedIntNode( 2 ), new LinkedIntNode( 2 )
            },
            new Object[] {
                asLinkedList( 7, 1, 6 ), asLinkedList( 5, 9, 2 ),
                asLinkedList( 2, 1, 9 ), asLinkedList( 1, 3, 0, 8 )
            },
            new Object[] {
                asLinkedList( 6, 1, 7 ), asLinkedList( 2, 9, 5 ),
                asLinkedList( 8, 0, 3, 1 ), asLinkedList( 9, 1, 2 )
            }
        );
    }

    public C2E5Test( LinkedIntNode first, LinkedIntNode second, LinkedIntNode reverse, LinkedIntNode forward ) {
        this.first = first;
        this.second = second;
        this.reverse = reverse;
        this.forward = forward;
    }

    @Test public void testReverseAdd() {
        Assert.assertArrayEquals( asArray( reverse ),
                                  asArray( C2E5Solution.addReverse( first, second ) ) );
    }

    @Test public void testForwardAdd() {
        Assert.assertArrayEquals( asArray( forward ),
                                  asArray( C2E5Solution.addForward( first, second ) ) );
    }

    LinkedIntNode first;
    LinkedIntNode second;
    LinkedIntNode reverse;
    LinkedIntNode forward;
}
