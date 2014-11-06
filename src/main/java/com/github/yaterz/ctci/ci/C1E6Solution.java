package com.github.yaterz.ctci.ci;

/**
 * Given an image represented by an NxN matrix of 4 bytes pixels, rotate the image by 90°
 *
 * @author mattyaterz
 * @since 11/2/14
 */
public class C1E6Solution {
    public static void rotateNinety( int[][] image, boolean directionRight ) {
        if ( image == null ) {
            return;
        }

        //[0,0] -> [0,4] -> [4,4] -> [4,0] -> [0,0]
        //[0,1] -> [1,4] -> [4,3] -> [3,0] -> [0,1]
        //[0,2] -> [2,4] -> [4,2] -> [2,0] -> [0,2]
        //[0,3] -> [3,4] -> [4,1] -> [1,0] -> [0,3]

        //[1,1] -> [1,3] -> [3,3] -> [3,1] -> [1,1]
        //[1,2] -> [2,3] -> [3,2] -> [2,1] -> [1,2]

        //[2,2]

        for ( int min = 0; min < image.length; min++ ) {
            int max = image.length - min - 1;

            for ( int pos = 0; pos < max - min; pos++ ) {
                //save top
                int tmp = image[ min ][ min + pos ];

                if ( directionRight ) {
                    //move left to top
                    image[ min ][ min + pos ] = image[ max - pos ][ min ];
                    //move bottom to left
                    image[ max - pos ][ min ] = image[ max ][ max - pos ];
                    //move right to bottom
                    image[ max ][ max - pos ] = image[ min + pos ][ max ];
                    //move top to right
                    image[ min + pos ][ max ] = tmp;
                }
                else {
                    //move right to top
                    image[ min ][ min + pos ] = image[ min + pos ][ max ];
                    //move bottom to right
                    image[ min + pos ][ max ] = image[ max ][ max - pos ];
                    //move left to bottom
                    image[ max ][ max - pos ] = image[ max - pos ][ min ];
                    //move top to left
                    image[ max - pos ][ min ] = tmp;
                }
            }
        }
    }
}
