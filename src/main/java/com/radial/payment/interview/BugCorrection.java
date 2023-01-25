package com.radial.payment.interview;

import java.util.regex.Pattern;

/**
 * The following code contains one or more bugs. Correct them such that all of the unit tests in BugCorrectionTest pass.
 */
public class BugCorrection {
    private static final Pattern VALID_ARGUMENT_PATTERN = Pattern.compile("[a-z]+");
    private static final char[] ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    /**
     * Cipher a given raw text with the provided passphrase.
     * For simplicity this is limited to lowercase letters.
     * This one way cipher is a permutation of a caesar shift performed as follows
     *
     * - Identify the index of the shift character in the current passphrase
     *         using the current raw character (a = 0, b = 2, ... z = 25)
     * -- If the index is beyond the length of the passphrase, wrap to the beginning
     *         e.g. If the passphrase is "bar" and the index is 4, use 'a'
     * - Calculate the offset as a = 1, b = 2, ... z = 26
     * - Perform a traditional caesar shift using the given offset on the raw character.
     *
     * @param rawText The text to cipher
     * @param passphrase The passphrase used for determining the caeser shift to use.
     * @return The ciphered text.
     */
    public static String cipher(String rawText, String passphrase) {
        validate(rawText, passphrase);
        StringBuilder ciphered = new StringBuilder(rawText.length());
        for (char c : rawText.toCharArray()) {
            int offset = passphrase.charAt(c % passphrase.length()) - 'a';
            ciphered.append(ALPHABET[c - 'a' + offset]);
        }
        return ciphered.toString();
    }

    private static void validate(String... arguments) {
        for (String argument : arguments) {
            if (argument == null || !VALID_ARGUMENT_PATTERN.matcher(argument).matches()) {
                throw new IllegalArgumentException("The argument " + argument + " is not valid");
            }
        }
    }
}
