package Animal;

import Sharpie.Sharpie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmTest {

    @Test
    void constructor(){
        Exception exception = assertThrows(IllegalArgumentException.class,()-> {
            Farm farm = new Farm(0);
            Farm farm2 = new Farm(-45);

        });
        String expectedMessage = "Number cannot be zero or negative.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}