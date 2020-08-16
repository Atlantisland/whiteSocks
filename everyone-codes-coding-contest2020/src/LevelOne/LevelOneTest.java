package LevelOne;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.text.ParseException;

class LevelOneTest {
    LevelOne levelOne = new LevelOne();

    @Test
    void countNumber() throws ParseException {

        long expected = 3907;
        long result = levelOne.count("09:17:24", "16:34:51");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void countZero() throws ParseException {

        long expected = 0;
        long result = levelOne.count("05:49:56", "20:29:11");
        Assertions.assertEquals(expected, result);
    }
}