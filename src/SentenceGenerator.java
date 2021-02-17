//(Random Sentences) Write an application that uses random-number generation to create
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

    public void setArticle(String[] article) {
        this.article = article;
    }

    public String[] getNoun() {
        return noun;
    }

    public void setNoun(String[] noun) {
        this.noun = noun;
    }

    public String[] getVerb() {
        return verb;
    }

    public void setVerb(String[] verb) {
        this.verb = verb;
    }

    public String[] getPreposition() {
        return preposition;
    }

    public void setPreposition(String[] preposition) {
        this.preposition = preposition;
    }

    public String getSentence() {
        StringBuilder builder = new StringBuilder();
        SecureRandom random = new SecureRandom();
        int randomIndex = random.nextInt(5);
        String article = getArticle()[randomIndex];
        char firstLetter = article.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        article = article.replace(article.charAt(0),firstLetter);
        String space = " ";

        builder.append(article);
        builder.append(space);

        String noun = getNoun()[randomIndex];
        firstLetter = noun.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        noun = noun.replace(noun.charAt(0), firstLetter);
        builder.append(noun);
        builder.append(space);

        String verb = getVerb()[randomIndex];
        firstLetter = verb.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        verb = verb.replace(verb.charAt(0),firstLetter);
        builder.append(verb);
        builder.append(space);

        String preposition = getPreposition()[randomIndex];
        firstLetter = preposition.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        preposition = preposition.replace(preposition.charAt(0),firstLetter);
        builder.append(preposition);
        builder.append(space);

         randomIndex = random.nextInt(5);
        article = getArticle()[randomIndex];
        firstLetter = article.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        article = article.replace(article.charAt(0),firstLetter);
        builder.append(article);
        builder.append(space);

        randomIndex = random.nextInt(5);
        noun = getNoun()[randomIndex];
        firstLetter = noun.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        noun = noun.replace(noun.charAt(0),firstLetter);
        builder.append(noun);


        return builder.toString();
    }
}
