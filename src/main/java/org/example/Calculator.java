package org.example;

public class Calculator {

    public static int calculate(int n1, int n2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if (n2 == 0) {
                    throw new ArithmeticException("Делить на ноль нельзя");
                }

                result = n1 / n2;
            break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calculate(n1, n2, operation);
        }
        return result;

    }
}

