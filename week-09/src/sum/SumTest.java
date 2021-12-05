package sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sumInt() {
        Sum sum = new Sum();
        sum.add(5);
        sum.add(56);
        sum.add(1);
        sum.add(35);
        assertEquals(97,sum.sumInt());
    }
    @Test
    void sumWithEmpty(){
        Sum sum = new Sum();
        assertEquals(0,sum.sumInt());
    }
    @Test
    void sumWithNull(){
        Sum sum = new Sum();
        Exception exception = assertThrows(IllegalArgumentException.class,()-> {
            sum.add(null);
        });

        String expectedMessage = "Integer cant be null.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }


    @Test
    void sumWithOne(){
        Sum sum = new Sum();
        sum.add(5);
        assertEquals(5,sum.sumInt());

    }
}