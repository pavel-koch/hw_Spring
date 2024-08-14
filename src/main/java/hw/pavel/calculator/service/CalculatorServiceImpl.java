package hw.pavel.calculator.service;

import hw.pavel.calculator.exception.ParamException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }

    public int plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new ParamException("Один из параметров отсутствует");
        }
        return num1 + num2;
    }

    public int minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new ParamException("Один из параметров отсутствует");
        }
        return num1 - num2;
    }

    public int multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new ParamException("Один из параметров отсутствует");
        }
        return num1 * num2;
    }

    public double divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new ParamException("Один из параметров отсутствует");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 в Java запрещено!");
        }
        return (double) num1 / num2;
    }
}
