package com.github.yaterz.ctci.ci;

/**
 * Write a method to replace all spaces in a string with '%20'.  Assume the string has sufficient space to hold the additional characters
 *
 * @author mattyaterz
 * @since 11/2/14
 */
public class C1E4Solution {
    // assumes the length of 'str' is exactly what you need to expand the spaces
    public static void urlEncodeSpaces( char[] str ) {
        if ( str == null ) {
            return;
        }

        int offset = str.length - 1;

        for ( int i = str.length - 1; i >= 0; i-- ) {
            if ( str[ i ] == 0 ) {
                continue;
            }

            if ( str[ i ] == ' ' ) {
                str[ offset-- ] = '0';
                str[ offset-- ] = '2';
                str[ offset-- ] = '%';
            }
            else {
                str[ offset-- ] = str[ i ];
            }
        }
    }
}
