package hw.pavel.calculator.service;

import hw.pavel.calculator.exception.ParamException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParamTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideNulParams")
    void plusParamNullTest(Integer num1, Integer num2) {
        assertThrows(ParamException.class, () -> calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideNulParams")
    void minusParamNullTest(Integer num1, Integer num2) {
        assertThrows(ParamException.class, () -> calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideNulParams")
    void multiplyParamNullTest(Integer num1, Integer num2) {
        assertThrows(ParamException.class, () -> calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideNulParams")
    void divideParamNullTest(Integer num1, Integer num2) {
        assertThrows(ParamException.class, () -> calculatorService.divide(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideNormalParams")
    void plusNormalParamTest(Integer num1, Integer num2) {
        int expected = num1 + num2;

        int actual = calculatorService.plus(num1, num2);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideNormalParams")
    void minusNormalParamTest(Integer num1, Integer num2) {
        int expected = num1 - num2;

        int actual = calculatorService.minus(num1, num2);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideNormalParams")
    void multiplyNormalParamTest(Integer num1, Integer num2) {
        int expected = num1 * num2;

        int actual = calculatorService.multiply(num1, num2);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideNormalParams")
    void divideNormalParamTest(Integer num1, Integer num2) {
        double expected = (double) num1 / num2;

        double actual = calculatorService.divide(num1, num2);

        assertEquals(expected, actual);
    }


    private static Stream<Arguments> provideNulParams() {
        return Stream.of(Arguments.of(null, 6),
                Arguments.of(10, null),
                Arguments.of(null, null));
    }

    private static Stream<Arguments> provideNormalParams() {
        return Stream.of(Arguments.of(1000, 6),
                Arguments.of(10, -120),
                Arguments.of(8654, 1));
    }
}