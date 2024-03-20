package edu.scoalainformala;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {


    @ParameterizedTest
    @ValueSource( strings = {"10dm", "100 cm", "1m"})
    void getMM_ValidInput_ReturnInteger(String input) {
        double expected = 1000;
        double actual = Convertor.getMM(input);
        Assertions.assertEquals( expected, actual);
    }

    @Test
    void getMM_InvalidInput_ReturnZero() {
        String input = "invalid input";
        double expected = 0;
        double actual = Convertor.getMM(input);
        Assertions.assertEquals(expected, actual);
    }
}
