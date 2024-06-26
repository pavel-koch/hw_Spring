package hw.pavel.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorConroller {
    private final CalculatorService calculatorService;

    public CalculatorConroller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров отсутствует";
        }
        int result = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров отсутствует";
        }
        int result = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров отсутствует";
        }
        int result = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров отсутствует";
        }
        if (num2 != 0) {
            double result = calculatorService.divide(num1, num2);
            return num1 + " / " + num2 + " = " + result;
        }
        return "Деление на 0 в Java запрещено!";
    }

}
