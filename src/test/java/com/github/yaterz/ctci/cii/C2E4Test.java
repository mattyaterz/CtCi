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
@RunWith( Parameterized.class ) public class C2E4Test {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
                new Object[] { null, 0, null },
                new Object[] { asLinkedList( new int[] { 0, 1, 2, 3, 4 } ),
                               2, asLinkedList( new int[] { 0, 1, 2, 3, 4 } ) },
                new Object[] { asLinkedList( new int[] { 4, 3, 2, 1, 0 } ),
                               2, asLinkedList( new int[] { 1, 0, 4, 3, 2 } ) },
                new Object[] { asLinkedList( new int[] { 2, 0, 3, 1, 4 } ),
                               2, asLinkedList( new int[] { 0, 1, 2, 3, 4 } ) },
                new Object[] { asLinkedList( new int[] { 4, 3, 2, 1, 0 } ),
                               5, asLinkedList( new int[] { 4, 3, 2, 1, 0 } ) },
                new Object[] { asLinkedList( new int[] { 4, 3, 2, 1, 0 } ),
                               0, asLinkedList( new int[] { 4, 3, 2, 1, 0 } ) }
        );
    }

    public C2E4Test( SingleLinkedNode input, int partition, SingleLinkedNode output ) {
        this.input = input;
        this.partition = partition;
        this.output = output;
    }

    @Test public void testPartition() {
        Assert.assertArrayEquals( asArray( output ),
                                  asArray( C2E4Solution.partition( input, partition ) ) );
    }

    SingleLinkedNode input;
    int partition;
    SingleLinkedNode output;

}
