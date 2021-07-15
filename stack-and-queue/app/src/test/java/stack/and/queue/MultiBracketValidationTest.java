package stack.and.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class MultiBracketValidationTest {
        @Test
    public void testRegexTrue() {
        //String toPassIn = "0";
            Assertions.assertTrue(MultiBracketValidation.testForMirrors("["));
            Assertions.assertTrue(MultiBracketValidation.testForMirrors("{"));
            Assertions.assertTrue(MultiBracketValidation.testForMirrors("("));
    }

    @Test public void testRegexFalse(){
        Assertions.assertFalse(MultiBracketValidation.testForMirrors("[]"));
        Assertions.assertFalse(MultiBracketValidation.testForMirrors("2"));
        Assertions.assertFalse(MultiBracketValidation.testForMirrors("3"));
    }
    @Test
    public void removeCurlyBrackets() {
        Assertions.assertTrue(MultiBracketValidation.testForMirrors("{}"));
        Assertions.assertTrue(MultiBracketValidation.testForMirrors("{}()[]"));
        Assertions.assertTrue(MultiBracketValidation.testForMirrors("{{a}}"));
        Assertions.assertTrue(MultiBracketValidation.testForMirrors("a{a}"));
        Assertions.assertTrue(MultiBracketValidation.testForMirrors("{}a()"));
        Assertions.assertTrue(MultiBracketValidation.testForMirrors("{)}"));
        Assertions.assertTrue(MultiBracketValidation.testForMirrors("{[}"));
        Assertions.assertTrue(MultiBracketValidation.testForMirrors("}{)}"));

    }
}
