package bridgesoft;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BridgeSoftTest {
    BridgeSoft bridgeSoft;

    @BeforeEach
    void setUp() {
        bridgeSoft = new BridgeSoft();
    }

    @AfterEach
    void tearDown() {
        bridgeSoft = null;
    }

    @Test
    void removeDuplicateFromString() {

    }

    @Test
    void removeDuplicateWithLogic() {
        String name ="vamshi";
        String actual = "vamshi";
        String expected = "ihsmav";
        String result = bridgeSoft.stringReversal(name);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void sortString() {
    }

    @Test
    void palindromeCheck() {
        String name ="vamshi";
        String expected = "ihsmav";
        String actual = bridgeSoft.palindromeCheck(name);
        Assertions.assertEquals(expected,actual);
    }
}
