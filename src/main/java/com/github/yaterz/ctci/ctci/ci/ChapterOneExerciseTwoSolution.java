package com.github.yaterz.ctci.ctci.ci;

/**
 * Implement a function void reverse(char* str) in C or C++ which reverses a null-terminated string.
 * Obviously, this is not C, but we can get pretty close to the pointer array construct with a char[]
 *
 * @author mattyaterz
 * @since 11/2/14
 */
public class ChapterOneExerciseTwoSolution {
    public static void reverseString( char[] str ) { // would be char* str
        if ( str == null ) {
            return;
        }

        int start = 0; // would just use the str* pointer in C
        int end = 0; // would be set to str* initially in C
        char tmp;

        while ( end < str.length ) { // condition would be simply while( end* ) in C
            end++;
        }

        end--; // -1 b/c last char is null

        while ( start < end ) {
            tmp = str[ start ];
            str[ start++ ] = str[ end ];
            str[ end-- ] = tmp;
        }
    }
}
