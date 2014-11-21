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
 * @since 11/8/14
 */
@RunWith( Parameterized.class ) public class C2E1Test {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
            new Object[] { null, null },
            new Object[] { new SingleLinkedNode(), new SingleLinkedNode() },
            new Object[] { asLinkedList( 0, 1, 2, 3, 4 ),
                           asLinkedList( 0, 1, 2, 3, 4 ) },
            new Object[] { asLinkedList( 0, 0, 1, 2, 3 ),
                           asLinkedList( 0, 1, 2, 3 ) },
            new Object[] { asLinkedList( 0, 1, 1, 2, 3 ),
                           asLinkedList( 0, 1, 2, 3 ) },
            new Object[] { asLinkedList( 0, 1, 2, 3, 3 ),
                           asLinkedList( 0, 1, 2, 3 ) },
            new Object[] { asLinkedList( 0, 0, 0, 1, 1, 2, 3 ),
                           asLinkedList( 0, 1, 2, 3 ) },
            new Object[] { asLinkedList( 3, 0, 1, 2, 0, 1, 0 ),
                           asLinkedList( 3, 0, 1, 2 ) },
            new Object[] { asLinkedList( 0, 0, 0, 0, 0 ),
                           asLinkedList( 0 ) }
        );
    }

    public C2E1Test( SingleLinkedNode input, SingleLinkedNode output ) {
        this.input = input;
        this.output = output;
    }

    @Test public void testRemoveDuplicates() {
        C2E1Solution.removeDuplicates( input );
        Assert.assertArrayEquals( asArray( output ), asArray( input ) );
    }

    SingleLinkedNode input;
    SingleLinkedNode output;
}
