package Task5_7_8.src.main.java;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws DivisionZeroException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double x = scan.nextDouble();
        System.out.print("Введите второе число: ");
        double y = scan.nextDouble();
        System.out.println("Введите знак арифметического действия: +, -, *, / ");
        String sign = scan.next();
        scan.close();
        Calculator calculator = new Calculator(x, y, sign);
        calculator.Calculator();
    }
}

