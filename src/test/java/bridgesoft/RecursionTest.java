package bridgesoft;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {
    Recursion recursion1;

    @BeforeEach
    void setUp() {
        recursion1 = new Recursion();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void main() {
    }

    @Test
    void sum() {
    }

    @Test
    void fact() {
    }

    @Test
    void sumOfDigits() {
        int number = 1234;
        int expected = 10;
        int actual = recursion1.sumOfDigits(number);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void sumOfDigitsnot() {
        int number = 1234;
        int unexpected = 101;
        int actual = recursion1.sumOfDigits(number);
        Assertions.assertNotEquals(unexpected,actual);
    }

    @Test
    void fibo() {
    }
}
