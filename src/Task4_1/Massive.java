package Task4_1;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание №4.1: Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
 *
 * @author Andrey Kiprushin
 */

public class Massive {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        System.out.println("Массив:\n" + Arrays.toString(array));

        int maxNegative = 0, minPositive = 0, maxNegativeIndex = 0, minPositiveIndex = 0;;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                maxNegative = array[i];
            }
            if (array[i] > 0) {
                minPositive = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                maxNegative = Math.max(maxNegative, array[i]);
            }
            if (array[i] > 0) {
                minPositive = Math.min(minPositive, array[i]);
            }
        }
        System.out.println("Максимальный отрицательный элемент массива: " + maxNegative);
        System.out.println("Минимальный положительный элемент массива: " + minPositive);

        for (int i = 0; i < array.length; i++) {
            if (maxNegative == array[i]) {
                maxNegativeIndex = i;
            } else if (minPositive == array[i]) {
                minPositiveIndex = i;
            }
        }
        array[maxNegativeIndex] = minPositive;
        array[minPositiveIndex] = maxNegative;
        System.out.println("Массив с перемещенными min и max элементами:\n" + Arrays.toString(array));
    }
}