package com.fourteenPointOneSeven;
//14.7 (Pig Latin) Write an application that encodes English-language phrases into pig Latin. Pig
//        Latin is a form of coded language. There are many different ways to form pig Latin phrases. For
//        simplicity, use the following algorithm:
//        To form a pig Latin phrase from an English-language phrase, tokenize the phrase into words
//        with String method split. To translate each English word into a pig Latin word, place the
//        first
//        letter of the English word at the end of the word and add the letters “ay.” Thus, the word
//        “jump”
//        becomes “umpjay,” the word “the” becomes “hetay,” and the word “computer” becomes “omputercay.”
//        Blanks between words remain as blanks. Assume the following: The English phrase consists of
//        words separated by blanks, there are no punctuation marks and all words have two or more letters.
//        Method printLatinWord should display each word. Each token is passed to method printLatinWord to
//        print the pig Latin word. Enable the user to input the sentence. Keep a running display of
//        all the converted sentences in a text area.

import java.awt.font.ImageGraphicAttribute;
import java.util.Scanner;

public class PigLatin {


    public String[] tokenizeEnglishPhrase(String phrase) {
        String[] tokenizedPhrase = phrase.split(" ");
        return tokenizedPhrase;
    }

    public String convertPhrase(String phrase) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = tokenizeEnglishPhrase(phrase);
        for (int i = 0; i < words.length; i++) {
           String convertedWord = individualWordConversionToPigLatin(words[i]);
           stringBuilder.append(convertedWord);
           if (i != words.length-1 ){
               stringBuilder.append(" ");
           }

        }
        String newWord = stringBuilder.toString();
        return newWord;
    }

    public String individualWordConversionToPigLatin(String word) {
        String wordWithoutFirstLetter = word.substring(1);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(wordWithoutFirstLetter);
        stringBuilder.append(word.charAt(0));
        stringBuilder.append("ay");
        return stringBuilder.toString();
    }
}
