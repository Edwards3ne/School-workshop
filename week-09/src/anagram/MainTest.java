package anagram;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void areAnagramTest() {
        String first="Batman";
        String second="ManBat";

        assertTrue(Main.areAnagram(first, second));


    }
    @Test
    void areAnagramTestNotAnagram() {
        String first="Batmann";
        String second="ManBat";

        assertFalse(Main.areAnagram(first, second));


    }
    @Test
    void countLettersTest(){

        HashMap<Character,Integer> test=Main.countLetters("all");
        assertEquals(1,test.get('a'));
        assertEquals(2,test.get('l'));
    }
    @Test
    void coutLettersEmptyString(){

        assertEquals(null,Main.countLetters(""));
    }
}