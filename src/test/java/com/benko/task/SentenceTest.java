package com.benko.task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SentenceTest {

    @Test
    public void shouldReverseWords() {
        // Given
        Sentence sentence = new Sentence("Ala ma kota");
        Sentence expected = new Sentence("kota ma Ala");

        // When
        Sentence result = sentence.reverse();

        // Then
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailWhenGivenNull() {
        // when
        new Sentence(null);
    }

}
