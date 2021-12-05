package apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

    @Test
    void isTheSame(){
        Apple apple=new Apple();
        assertEquals("apple",apple.getApple());
    }

}