package LevelThree;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class LevelThreeTest {

    LevelThree level3 = new LevelThree();

    @Test
    void find() {

        long expected = 3907;
        String result = level3.findFirstCorrect("fgg hgfhg bfgcgf hg  gh ");
        Assertions.assertEquals(expected, result);
    }
}