package org.example;

public class Calculator {

        public static int calculate(int n1, int n2, char operation) {
             return switch (operation) {
                case '+' -> n1 + n2;
                case '-' -> n1 - n2;
                case '*' -> n1 * n2;
                case '/' -> {
                    if (n2 == 0) {
                        throw new ArithmeticException("Делить на ноль нельзя");
                    }
                    yield n1 / n2;
                }
                default -> throw new IllegalArgumentException("Неизвестная операция: " + operation);
            };
        }
}
