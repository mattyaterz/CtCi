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
import static com.github.yaterz.ctci.cii.C2TestUtils.getAtIndex;

/**
 * @author mattyaterz
 * @since 11/8/14
 */
@RunWith( Parameterized.class ) public class C2E3Test {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
                new Object[] { null, 0, null },
//                new Object[] { new SingleLinkedNode( 0 ), 0, null },
                new Object[] { asLinkedList( 0, 1, 2, 3, 4 ),
                               2, asLinkedList( 0, 1, 3, 4 ) },
                new Object[] { asLinkedList( 0, 1, 2, 3, 4 ),
                               0, asLinkedList( 1, 2, 3, 4 ) }//,
//                new Object[] { asLinkedList( 0, 1, 2, 3, 4 ),
//                               4, asLinkedList( 0, 1, 2, 3 ) }
        );
    }

    public C2E3Test( LinkedIntNode input, int indexToRemove, LinkedIntNode output ) {
        this.input = input;
        this.indexToRemove = indexToRemove;
        this.output = output;
    }

    @Test public void testRemoveNode() {
        C2E3Solution.removeNode( getAtIndex( input, indexToRemove ) );
        Assert.assertArrayEquals( asArray( output ), asArray( input ) );
    }

    LinkedIntNode input;
    int indexToRemove;
    LinkedIntNode output;
}
