package com.github.yaterz.ctci.ci;

import java.util.Arrays;

/**
 * Given two strings, write a method to determine if one is a permutation of the other.
 *
 * I am assuming no exceptions, i.e. case sensitivity, special characters (e.g. spaces) all count
 *
 * @author mattyaterz
 * @since 11/2/14
 */
public class C1E3Solution {
    public static boolean isPermutation( String first, String second ) {
        if ( first == null || second == null ) {
            return false;
        }

        if ( first.length() != second.length() ) {
            return false;
        }

        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();

        Arrays.sort( firstChars );
        Arrays.sort( secondChars );

        return Arrays.equals( firstChars, secondChars );
    }
}
