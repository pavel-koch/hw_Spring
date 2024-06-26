package hw.pavel.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        return (double) num1 / num2;
    }
}
