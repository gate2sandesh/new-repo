package com.radial.payment.interview;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.aMapWithSize;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.is;

/**
 * When fully Implementation.primeFactors is fully implemented all of the
 *     test cases below will pass. This class should not be modified.
 */
public class ImplementationTest {
    @Test
    public void factorsOfZeroIsZero() {
        assertThat(Implementation.primeFactors(0), allOf(
                is(aMapWithSize(1)),
                hasEntry(0L, 1L)));
    }

    @Test
    public void factorsOfOne() {
        assertThat(Implementation.primeFactors(1), allOf(
                is(aMapWithSize(1)),
                hasEntry(1L, 1L)));
    }

    @Test
    public void factorsOfNegativeOne() {
        assertThat(Implementation.primeFactors(-1), allOf(
                is(aMapWithSize(2)),
                hasEntry(1L, 1L),
                hasEntry(-1L, 1L)));
    }

    @Test
    public void factorsOf15() {
        assertThat(Implementation.primeFactors(15), allOf(
                is(aMapWithSize(2)),
                hasEntry(3L, 1L),
                hasEntry(5L, 1L)));
    }

    @Test
    public void factorsOf28() {
        assertThat(Implementation.primeFactors(28), allOf(
                is(aMapWithSize(2)),
                hasEntry(2L, 2L),
                hasEntry(7L, 1L)));
    }

    @Test
    public void factorsOf4840() {
        assertThat(Implementation.primeFactors(4_840), allOf(
                is(aMapWithSize(3)),
                hasEntry(2L, 3L),
                hasEntry(5L, 1L),
                hasEntry(11L, 2L)));
    }

    @Test
    public void factorsOf5915587277() {
        assertThat(Implementation.primeFactors(280_879L), allOf(
                is(aMapWithSize(1)),
                hasEntry(280_879L, 1L)));
    }
}
