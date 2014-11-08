package com.github.yaterz.ctci.ci;

/**
 * Assume you have a method {@code isSubstring} which checks if one word is a substring of another.
 * Given two strings, s1 and s2, write code to check if s3 is a rotations of s1 using only one call to {@code isSubstring}
 * E.g., "waterbottle" is a rotation of "erbottlewat"
 *
 * @author mattyaterz
 * @since 11/7/14
 */
public class C1E8Solution {
    public static boolean isRotation( String s1, String s2 ) {
        return s1 != null &&
                s2 != null &&
                s1.length() == s2.length() &&
                ( s1 + s1 ).contains( s2 ); // Using contains( CharSequence ) as 'isSubstring'
    }
}
