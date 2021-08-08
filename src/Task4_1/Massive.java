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
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Массив:\n" + Arrays.toString(array));
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Массив с перемещенными min и max элементами:\n" + Arrays.toString(change(array)));
    }
    public static int[] change(int[] array){
        int max = array[0], min = array[0], maxIndex = 0, minIndex = 0;
        for(int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
            if (array[i]<min) {
                min = array[i];
                minIndex = i;
            }
        }
        array[maxIndex] = min;
        array[minIndex] = max;
        return array;
    }
}


    








