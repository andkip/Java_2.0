package Task5;

import Task5.Operations.Divide;
import Task5.Operations.Minus;
import Task5.Operations.Multiply;
import Task5.Operations.Plus;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y;

        System.out.println("Введите первое число:");
        x = scan.nextDouble();
        System.out.println("Введите второе число:");
        y = scan.nextDouble();
        System.out.println("Введите знак арифметического действия: +, -, *, / ");
        String sign = scan.next();
        scan.close();

        switch (sign) {
            case "+":
                Plus plus = new Plus(x, y);
                System.out.printf("Результат: %.4f\n", plus.result());
                break;
            case "-":
                Minus minus = new Minus(x, y);
                System.out.printf("Результат: %.4f\n", minus.result());
                break;
            case "*":
                Multiply multiply = new Multiply(x, y);
                System.out.printf("Результат: %.4f\n", multiply.result());
                break;
            case "/":
                Divide divide = new Divide(x, y);
                if (y == 0)
                    System.out.println("Деление на 0 запрещено");
                else
                    System.out.printf("Результат: %.4f\n", divide.result());
                break;
            default:
                System.out.println("Некорректный знак операции");
                break;
        }
    }
}
