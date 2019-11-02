package com.benko.task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordOrderReverserTest {

    @Test
    public void shouldReverseWordOrder(){
        //given
        String sentence = "Ala ma kota";

        //when
        String result = WordOrderReverser.reverse(sentence);

        //then
        assertEquals("kota ma Ala", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenGivenNull(){
        //given
        String sentence = null;

        //when
        WordOrderReverser.reverse(sentence);
    }
}
