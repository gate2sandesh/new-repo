package com.radial.payment.interview;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Implements the method below based on the description in the javadoc and add appropriate
 * unit test coverage to ApiImplmentationTest
 */
public class ApiImplementation {
    /**
     * Compare the given (non-null) string based on their common prefix.
     * Comparisons performed by this implementation should be performed only based on a common number of
     * leading characters, e.g. if the strings are:
     * -- "abc" & "yz" the comparison should be between "ab" & "yz"
     * -- "ab" & "xyz" the comparison should be between "ab" & "xy"
     *
     * If the string are of equal length the full string should be compared.
     * All remaining comparison is performed based on standard java string ordering.
     * The return value follows the rules of a standard java comparator.
     *
     * @param left The first string to compare.
     * @param right The second string to compare.
     * @return zero, a negative, positive value if the left argument is equal to, less than or greater than
     *         the right argument as described above.  
     */
    public static int compareStringPrefixes(String left, String right) {
        if(left==null || right ==null){
            throw new IllegalArgumentException();
        }
        if(left.length()==right.length()){
            return left.compareTo(right);
        }
        if(left.length()>right.length()){
           return left.substring(0,right.length()).compareTo(right);
        } else {
           return right.substring(0,left.length()).compareTo(left);
        }


    }
}
