package com.github.yaterz.ctci.cii;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static com.github.yaterz.ctci.cii.C2TestUtils.asLinkedList;

/**
 * @author mattyaterz
 * @since 11/8/14
 */
@RunWith( Parameterized.class ) public class C2E2Test {
    @Parameters public static Collection<Object[]> testData() {
        return Arrays.asList(
            new Object[] { null, 0, null },
            new Object[] { null, 1, null },
            new Object[] { new LinkedIntNode( 0 ), 0, new LinkedIntNode( 0 ) },
            new Object[] { new LinkedIntNode( 0 ), 2, null },
            new Object[] { asLinkedList( 0, 1, 2, 3, 4 ),
                           2, new LinkedIntNode( 2 ) },
            new Object[] { asLinkedList( 0, 1, 2, 3, 4 ),
                           0, new LinkedIntNode( 4 ) },
            new Object[] { asLinkedList( 0, 1, 2, 3, 4 ),
                           4, new LinkedIntNode( 0 ) }
        );
    }

    public C2E2Test( LinkedIntNode list, int reverseOffset, LinkedIntNode node ) {
        this.list = list;
        this.reverseOffset = reverseOffset;
        this.node = node;
    }

    @Test public void testGetFromEndAt() {
        if ( node == null ) {
            Assert.assertNull( C2E2Solution.getFromEndAt( list, reverseOffset ) );
        }
        else {
            Assert.assertEquals( node.element, C2E2Solution.getFromEndAt( list, reverseOffset ).element );
        }
    }

    @Test public void testGetFromEndRecursive() {
        if ( node == null ) {
            Assert.assertNull( C2E2Solution.getFromEndRecursive( list, reverseOffset ) );
        }
        else {
            Assert.assertEquals( node.element, C2E2Solution.getFromEndRecursive( list, reverseOffset ).element );
        }
    }

    LinkedIntNode list;
    LinkedIntNode node;
    int reverseOffset;
}
