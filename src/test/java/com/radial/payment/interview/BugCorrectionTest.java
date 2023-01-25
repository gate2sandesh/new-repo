package com.radial.payment.interview;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Do not remove any of these test cases. When the bug(s) in BugCorrection.cipher are addressed
 * all of these tests will pass. You may add test cases to aid in your debugging.
 */
public class BugCorrectionTest {
    @Test
    public void cipherThrowsExceptionForInvalidArguments() {
        assertThrows(IllegalArgumentException.class, () -> BugCorrection.cipher(null, "abc"));
        assertThrows(IllegalArgumentException.class, () -> BugCorrection.cipher("abc", null));
        assertThrows(IllegalArgumentException.class, () -> BugCorrection.cipher("FOO", "abc"));
        assertThrows(IllegalArgumentException.class, () -> BugCorrection.cipher("abc", "FOO"));
    }

    @Test
    public void cipherWithSingleCharacterPassphrase() {
        assertThat(BugCorrection.cipher("abc", "a"), is(equalTo("bcd")));
    }

    @Test
    public void cipherWrapsAtTheEndOfTheAlphabet() {
        assertThat(BugCorrection.cipher("xyz", "b"), is(equalTo("zab")));
    }

    @Test
    public void cipherWithMultiCharacterPassphrase() {
        assertThat(BugCorrection.cipher("abc", "abc"), is(equalTo("bdf")));
    }

    @Test
    public void cipherWitPassphraseLongerThanRawText() {
        assertThat(BugCorrection.cipher("abc", "abcdef"), is(equalTo("bdf")));
    }

    @Test
    public void cipherWrapsAtTheEndOfThePassphrase() {
        assertThat(BugCorrection.cipher("def", "bar"), is(equalTo("ffx")));
    }

    @Test
    public void cipherComplexValues() {
        assertThat(BugCorrection.cipher("secretmessage", "password"), is(equalTo("lbvsbmjbllqyb")));
        assertThat(BugCorrection.cipher("helloworld", "fizz"), is(equalTo("hkllowoald")));
        assertThat(BugCorrection.cipher("plainttext", "buzz"), is(equalTo("plckittgxt")));
    }
}
