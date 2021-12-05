package Sharpie;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {

    @Test
    void SharpieConstructorNegative(){
        Exception exception = assertThrows(IllegalArgumentException.class,()-> {
            Sharpie sharpie = new Sharpie("blue", -44.00);

        });
        String expectedMessage = "Width cannot be negative number";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    void SharpieConstructorZero(){
        Exception exception = assertThrows(IllegalArgumentException.class,()-> {
            Sharpie sharpie = new Sharpie("blue", 0);

        });
        String expectedMessage = "Width cannot be zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


    @Test
    void setInkAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class,()-> {
            Sharpie sharpie = new Sharpie();
            sharpie.setInkAmount(-55);
        });
        String expectedMessage = "Number can't be negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }
}