package de.htw_berlin.fb4.ossd.melda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OpeningSentenceTest {

    @Test
    void getReturnsExpectedSentence() {
        OpeningSentence sentence = new OpeningSentence();

        String result = sentence.get();

        assertEquals(
                "Am frühen Morgen öffnete die Stadt langsam ihre Augen.",
                result
        );
    }

    @Test
    void getReturnsNonBlankSentence() {
        OpeningSentence sentence = new OpeningSentence();

        String result = sentence.get();

        assertFalse(result.isBlank());
    }

    @Test
    void getReturnsSentenceWithUsefulLength() {
        OpeningSentence sentence = new OpeningSentence();

        String result = sentence.get();

        assertTrue(result.length() >= 20);
    }
}