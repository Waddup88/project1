import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Введите выражение:");
        String expression = input.nextLine();
        String answer = calculator.calc(expression);
        System.out.println("Равно:\n" + answer);
    }

    public String calc(String input) {
        String[] inputSplit = input.split(" ");
        if (inputSplit.length != 3) {
            return "Недопустимое выражение";
        }
        Integer firstNumber = 0;
        Integer secondNumber = 0;
        try {
            firstNumber = Integer.valueOf(inputSplit[0]);
            secondNumber = Integer.valueOf(inputSplit[2]);
        } catch (NumberFormatException ex) {
            return "Недопустимое выражение";
        }
        if ((firstNumber < 1) || (firstNumber > 10) || (secondNumber < 1) || (secondNumber > 10)) {
            return "Числа должны быть от 1 до 10";
        }
        String sign = inputSplit[1];
        Integer result = 0;
        switch (sign) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                return "Недопустимый знак операции";
        }
        return String.valueOf(result);
    }
}