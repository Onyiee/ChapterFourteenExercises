package com.fourteenPointOneSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {
    PigLatin pigLatin;

    @BeforeEach
    void setUp() {
        pigLatin = new PigLatin();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void tokenizeEnglishPhrase(){
        //pigLatin.setPhrase("hello world");
        pigLatin.tokenizeEnglishPhrase("hello world");
        assertNotNull(pigLatin.tokenizeEnglishPhrase("hello world"));
        assertEquals(2, pigLatin.tokenizeEnglishPhrase("hello world").length);
    }

    @Test
    void convertEachWordToPigLatin(){
       String convertedWord = pigLatin.individualWordConversionToPigLatin("word");
      assertNotNull(convertedWord);
      assertEquals("ordway",convertedWord);

    }

    @Test
    void convertWordsBackToPhraseWithPigLatin(){
        assertEquals("owhay reaay ouyay",pigLatin.convertPhrase("how are you"));

    }

    @Test
    void convertPigLatinToEnglishPhrase(){
       assertEquals("how are you",  pigLatin.convertPigLatinToEnglishPhrase("owhay reaay ouyay"));
    }

}