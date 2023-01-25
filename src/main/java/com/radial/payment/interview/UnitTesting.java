package com.radial.payment.interview;

/**
 * Add test cases to cover this method in UnitTestingTest.
 */
public class UnitTesting {
    /**
     * Is the input string a palindrome (the same text if read backwards or forwards).
     * The empty string is considered a palindrome.
     *
     * @param string The value to test, not null.
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String string) {
        boolean palindrome = true;
        for (int offset = 0; offset < string.length() / 2; offset++) {
            if (string.charAt(offset) != string.charAt(string.length() - 1 - offset)) {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}
