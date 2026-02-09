package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int n1 = getInt();
            int n2 = getInt();
            char operation = getOperation();

            try {
                int result = Calculator.calculate(n1, n2, operation);
                System.out.println("Результат: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
            catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

        }

    }

    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        }
        else {
            System.out.println("Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию (+, -, *, /):");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        }
        else {
            System.out.println("Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }

        return operation;
    }
}
