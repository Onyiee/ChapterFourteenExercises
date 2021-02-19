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
    void acceptPhraseFromUser(){
        pigLatin.setPhrase("happy");
       assertEquals("happy", pigLatin.getPhrase());
    }



    @Test
    void tokenizeEnglishPhrase(){
        pigLatin.tokenizeEnglishPhrase("hello world");
        
    }

}