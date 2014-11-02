package com.github.yaterz.ctci.ci;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures? (i.e. - don't just use a HashSet)?
 *
 * @author mattyaterz
 * @since 11/2/14
 */
public class ChapterOneExerciseOneSolution {
    public static boolean isAnyCharRepeated( String str ) {
        if ( str == null ) {
            return false;
        }

        boolean[] charsetCharacters = new boolean[ getCharsInSet( Charset.defaultCharset() ) ];

        for ( char character : str.toCharArray() ) {
            if ( charsetCharacters[ character ] ) {
                return true;
            }

            charsetCharacters[ character ] = true;
        }

        return false;
    }

    public static boolean isAnyCharRepeatedSort( String str ) {
        if ( str == null ) {
            return false;
        }

        char[] chars = str.toCharArray();
        Arrays.sort( chars );

        for ( int i = 1; i < chars.length; i++ ) {
            if ( chars[ i - 1 ] == chars[ i ] ) {
                return true;
            }
        }

        return false;
    }

    private static int getCharsInSet( Charset charset ) {
        // TODO: figure out sizes of java.nio.charset.StandardCharsets
        switch ( charset.name() ) {
            case "ISO_8859_1":
            case "US_ASCII":
            case "UTF_16":
            case "UTF_16BE":
            case "UTF_16LE":
            case "UTF_8":
            default:
                return 0xFFFF;
        }
    }
}
