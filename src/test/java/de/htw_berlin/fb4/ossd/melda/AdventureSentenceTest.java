/*
 * Copyright 2026 Melda Sardogan
 * SPDX-License-Identifier: Apache-2.0
 */
package de.htw_berlin.fb4.ossd.melda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AdventureSentenceTest {

    @Test
    void getReturnsExpectedSentence() {
        AdventureSentence sentence = new AdventureSentence();

        String result = sentence.get();

        assertEquals(
                "Kurz darauf begann ein neugieriger Roboter, "
                        + "nach einem verlorenen Stern zu suchen.",
                result
        );
    }

    @Test
    void getReturnsNonBlankSentence() {
        AdventureSentence sentence = new AdventureSentence();

        String result = sentence.get();

        assertFalse(result.isBlank());
    }

    @Test
    void getReturnsSentenceWithUsefulLength() {
        AdventureSentence sentence = new AdventureSentence();

        String result = sentence.get();

        assertTrue(result.length() >= 20);
    }
}