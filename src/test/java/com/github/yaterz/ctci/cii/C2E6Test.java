package com.github.yaterz.ctci.cii;

/**
 * @author mattyaterz
 * @since 11/9/14
 */
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static com.github.yaterz.ctci.cii.C2E6Solution.findLoop;
import static com.github.yaterz.ctci.cii.C2TestUtils.asLinkedList;
import static com.github.yaterz.ctci.cii.C2TestUtils.asLoopedList;
import static com.github.yaterz.ctci.cii.C2TestUtils.getAtIndex;
import static org.junit.Assert.assertEquals;

@RunWith( Parameterized.class ) public class C2E6Test {
    @Parameters public static Collection<Object[]> testData() {
        SingleLinkedNode first = asLoopedList( 0, 0, 1, 2, 3, 4 );
        SingleLinkedNode middle = asLoopedList( 2, 0, 1, 2, 3, 4 );
        SingleLinkedNode last = asLoopedList( 4, 0, 1, 2, 3, 4 );

        return Arrays.asList(
            new Object[] { null, null },
            new Object[] { asLinkedList( 0, 1, 2, 3, 4 ), null },
            new Object[] { first, getAtIndex( first, 0 ) },
            new Object[] { middle, getAtIndex( middle, 2 )},
            new Object[] { last, getAtIndex( last, 4 ) }
        );
    }

    public C2E6Test( SingleLinkedNode loop, SingleLinkedNode loopNode ) {
        this.loop = loop;
        this.loopNode = loopNode;
    }

    @Test public void testFindLoop() {
        assertEquals( loopNode, findLoop( loop ) );
    }

    SingleLinkedNode loop;
    SingleLinkedNode loopNode;
}
