package Task2_3;

import java.util.Scanner;

/**
 * Задание №2: Калькулятор.
 * Задание №3: Поиск элемента с максимальной длиной из массива.
 *
 * @author Andrey Kiprushin
 */
public class Task2_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите программу:");
        System.out.println("1 - калькулятор");
        System.out.println("2 - поиск максимального слова в массиве");
        int program = scan.nextInt();
        if (program == 1) {
            calculator();
        } else if (program == 2) {
            maximumElement();
        } else
            System.out.println("Такого выбора нет");
    }

    public static void calculator() {
        Scanner scan = new Scanner(System.in);
        double x, y, z;
        System.out.println("Введите первое число:");
        x = scan.nextDouble();
        System.out.println("Введите второе число:");
        y = scan.nextDouble();
        System.out.println("Введите знак арифметического действия: +, -, *, / ");
        String sign = scan.next();

        switch (sign) {
            case "+":
                z = x + y;
                System.out.printf("Результат: %.4f\n", z);
                break;
            case "-":
                z = x - y;
                System.out.printf("Результат: %.4f\n", z);
                break;
            case "*":
                z = x * y;
                System.out.printf("Результат: %.4f\n", z);
                break;
            case "/":
                z = x / y;
                if (y == 0)
                    System.out.println("Деление на 0 запрещено");
                else
                    System.out.printf("Результат: %.4f\n", z);
                break;
            default:
                System.out.println("Некорректная операция");
                break;
        }
    }
    public static void maximumElement() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите количество вводимых слов:");
        int num = scan.nextInt();
        String[] array = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Введите слово " + (i + 1));
            array[i] = scan.next();
        }
        // поиск и вывод максимального значения массива
        String maxWord = null;
        int maxSize = array[0].length();
        for (int j = 0; j < array.length; j++) {
            if (array[j].length() >= maxSize) {
                maxSize = array[j].length();
                maxWord = array[j];
            }
        }
        System.out.println("Cамое длинное слово массива: " + maxWord);
    }
}

