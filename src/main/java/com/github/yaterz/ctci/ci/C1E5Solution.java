package com.github.yaterz.ctci.ci;

/**
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * E.g. - aabcccccaaa would become a2b1c5a3
 * If the 'compressed' string would not be smaller, return the original
 * Assume only a-z and A-Z strings
 *
 * @author mattyaterz
 * @since 11/2/14
 */
public class C1E5Solution {
    public static char[] getRepeatCompressedString( char[] str ) {
        if ( str == null ) {
            return null;
        }

        int compressedIndex = 0;
        int duplicateCount = 1;
        char[] compressedStr = new char[ str.length ];

        for ( int i = 1; i <= str.length; i++ ) {
            if ( i < str.length && str[ i - 1 ] == str[ i ] ) {
                duplicateCount++;
                continue;
            }

            String duplicateCountStr = Integer.toString( duplicateCount, 10 );

            if ( compressedIndex < compressedStr.length - duplicateCountStr.length() ) {
                compressedStr[ compressedIndex++ ] = str[ i - 1 ];

                for ( char digit : duplicateCountStr.toCharArray() ) {
                    compressedStr[ compressedIndex++ ] = digit;
                }

                duplicateCount = 1;
            }
            else {
                return str;
            }
        }

        char[] trimmedCompressed = new char[ compressedIndex ];
        System.arraycopy( compressedStr, 0, trimmedCompressed, 0, compressedIndex );
        return trimmedCompressed;
    }
}
