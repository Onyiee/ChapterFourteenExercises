package com.fourteenPointOneFive;//(Random Sentences) Write an application that uses random-number generation to create
//        sentences. Use four arrays of strings called article, noun, verb and preposition.
//        Create a sentence
//        by selecting a word at random from each array in the following order: article, noun,
//        verb, preposition, article and noun. As each word is picked, concatenate it to the
//        previous words in the sentence.
//        The words should be separated by spaces. When the final sentence is output, it should
//        start with a
//        capital letter and end with a period. The application should generate and display 20
//        sentences.
//        The article array should contain the articles "the", "a", "one", "some" and "any"; the noun
//        array should contain the nouns "boy", "girl", "dog", "town" and "car"; the verb array should
//        contain the verbs "drove", "jumped", "ran", "walked" and "skipped"; the preposition array should
//        contain the prepositions "to", "from", "over", "under" and "on".

import java.security.SecureRandom;

public class SentenceGenerator {
    private String[] article = {"the", "a", "one", "some", "any"};
    private String[] noun = {"boy", "girl", "dog", "town", "car"};
    private String[] verb ={"drove","jumped", "ran", "walked", "skipped"};
    private String[] preposition = {"to", "from", "over", "under", "on"};

    public String[] getArticle() {
        return article;
    }

    private String wordPicker(String[] composition){
        SecureRandom random = new SecureRandom();
        int randomIndex = random.nextInt(5);
        return composition[randomIndex];
    }

    public String getSentence() {
        StringBuilder builder = new StringBuilder();
        String[][] composition = {article, noun, verb, preposition,article, noun};
       for (int counter = 0; counter < composition.length; counter++){
           String word  = wordPicker(composition[counter]);
           if(counter == 0){
               word = word.replace(word.charAt(0), Character.toUpperCase(word.charAt(0)));
           }
           builder.append(word);
           if(counter != composition.length-1) {
               builder.append(" ");
           }
       }
       builder.append(".");
        return builder.toString();
    }
}
