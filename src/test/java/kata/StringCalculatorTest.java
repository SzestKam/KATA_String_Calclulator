package kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    public void shouldReturnZero_WhenEmptyString() {
        //given
        StringCalculator calculator = new StringCalculator();
        //when
        int result = calculator.add("");
        //then
        assertEquals(0, result);
    }

    @DisplayName("Various input of string numbers gives correct result")
    @ParameterizedTest(name = "Case {index}: On input {0} calculate result {1}")
    @CsvSource(
            value = {"0;0","3;3","23;23","1,4;5","1,2,3,4;10"},
            delimiter = ';')
    public void shouldReturnSumNumber_whenListOnInput(String in, String res){
        //given
        StringCalculator calculator = new StringCalculator();
        //when
        int result = calculator.add(in);
        //then
        int expected = Integer.parseInt(res);
        assertEquals(expected, result);
    }

}