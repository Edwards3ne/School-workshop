package fibonaci;

import anagram.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void FibonacciZero(){
        assertEquals(0,Fibonacci.fibonacci(0));
    }

    @Test
    void FibonacciNegative(){
        Exception exception = assertThrows(IllegalArgumentException.class,()-> {
            Fibonacci.fibonacci(-1);
        });
        String expectedMessage = "number can't be negative number.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


}