import com.fourteenPointOneFive.SentenceGenerator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceGeneratorTest {
    SentenceGenerator sentenceGenerator;

    @BeforeEach
    void setUp() {
        sentenceGenerator = new SentenceGenerator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getArticleArray(){
        assertNotNull(sentenceGenerator.getArticle());
        assertEquals(5,sentenceGenerator.getArticle().length);
    }

    @Test
    void generateSentence(){
        String sentence = sentenceGenerator.getSentence();
        assertNotNull(sentence);
        assertFalse(sentence.isEmpty());

        for (int counter= 0; counter < 20; counter++){
            System.out.println(sentenceGenerator.getSentence());
        }
    }

}