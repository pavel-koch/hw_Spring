package hw.pavel.calculator.service;

import hw.pavel.calculator.exception.ParamException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void plusNormalTest() {
        int num1 = 5;
        int num2 = 6;
        int expected = num1 + num2;

        int actual = calculatorService.plus(num1, num2);

        assertEquals(expected, actual);
    }
    @Test
    void plusNullTest() {
        Integer num1 = 5;
        Integer num2 = null;
        assertThrows(ParamException.class, () -> calculatorService.plus(num1, num2));
    }

    @Test
    void minusNormalTest() {
        int num1 = 5;
        int num2 = 6;
        int expected = num1 - num2;

        int actual = calculatorService.minus(num1, num2);

        assertEquals(expected, actual);
    }
    @Test
    void minusNullTest() {
        Integer num1 = 5;
        Integer num2 = null;
        assertThrows(ParamException.class, () -> calculatorService.minus(num1, num2));
    }

    @Test
    void multiplyNormalTest() {
        int num1 = 5;
        int num2 = 6;
        int expected = num1 * num2;

        int actual = calculatorService.multiply(num1, num2);

        assertEquals(expected, actual);
    }
    @Test
    void multiplyNullTest() {
        Integer num1 = 5;
        Integer num2 = null;
        assertThrows(ParamException.class, () -> calculatorService.multiply(num1, num2));
    }

    @Test
    void divideNormalTest() {
        int num1 = 5;
        int num2 = 6;
        double expected = (double)num1 / num2;

        double actual = calculatorService.divide(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    void divideNullTest() {
        Integer num1 = 5;
        Integer num2 = null;
        assertThrows(ParamException.class, () -> calculatorService.divide(num1, num2));
    }
    @Test
    void divideZeroTest() {
        Integer num1 = 5;
        Integer num2 = 0;
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(num1, num2));
    }
}