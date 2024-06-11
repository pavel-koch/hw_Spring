package hw.pavel.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Добро пожаловать!";
    }

    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }
    public String divide(int num1, int num2) {
        if (num2 != 0) {
            double result = (double) num1/ num2;
            return num1 + " / " + num2 + " = " + result;
        }
        return "Деление на 0 в Java запрещено!";
    }
}
