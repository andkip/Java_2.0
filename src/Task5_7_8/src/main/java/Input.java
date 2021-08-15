package Task5_7_8.src.main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws DivisionZeroException, IncorrectSignException {
        Scanner scan = new Scanner(System.in);
        double x = 0, y = 0;
        System.out.print("Введите первое число: ");
        try {
            x = scan.nextDouble();
        } catch (InputMismatchException e)
        {
            System.out.println("Неправильный формат числа");
            scan.nextDouble();
        }
        System.out.print("Введите второе число: ");
        try {
            y = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Неправильный формат числа");
            scan.nextDouble();
        }
        System.out.println("Введите знак арифметического действия: +, -, *, / ");
        String sign = scan.next();
        scan.close();
        Calculator calculator = new Calculator(x, y, sign);
        calculator.Calculator();
        System.out.printf("Результат: %.4f\n", calculator.getResult());
    }
}

