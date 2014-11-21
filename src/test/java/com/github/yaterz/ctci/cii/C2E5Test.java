package com.github.yaterz.ctci.cii;

import com.github.yaterz.ctci.SingleLinkedNode;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static com.github.yaterz.ctci.LinkedTestUtils.asArray;
import static com.github.yaterz.ctci.LinkedTestUtils.asLinkedList;

/**
 * @author mattyaterz
 * @since 11/9/14
 */
@RunWith( Parameterized.class ) public class C2E5Test {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
            new Object[] {
                null, null, new SingleLinkedNode( 0 ), new SingleLinkedNode( 0 )
            },
            new Object[] {
                null, new SingleLinkedNode( 1 ), new SingleLinkedNode( 1 ), new SingleLinkedNode( 1 )
            },
            new Object[] {
                new SingleLinkedNode( 2 ), null, new SingleLinkedNode( 2 ), new SingleLinkedNode( 2 )
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

    public C2E5Test( SingleLinkedNode first, SingleLinkedNode second, SingleLinkedNode reverse, SingleLinkedNode forward ) {
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

    SingleLinkedNode first;
    SingleLinkedNode second;
    SingleLinkedNode reverse;
    SingleLinkedNode forward;
}
