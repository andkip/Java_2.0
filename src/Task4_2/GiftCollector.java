package Task4_2;

import Task4_2.Sweets.*;

/**
 * Задание №4.2: Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 *
 * @author Andrey Kiprushin
 */

public class GiftCollector {
    public static void main(String[] args) {

        double price = 0;
        double weight = 0;

        Candy candy = new Candy("Ананасовые", 3.2, 295, "Джем");
        Chocolate chocolate = new Chocolate("Ritter Sport", 1.5, 190, "Ореховый");
        Gingerbread gingerbread = new Gingerbread("Тульский", 1.4, 170, true);
        JellyBean jellyBean = new JellyBean("Malabar", 0.7, 85, "Мишки");
        Gift[] gift = {candy, chocolate, gingerbread, jellyBean};

        for (int i=0;i<gift.length;i++) {
            System.out.println(gift[i].toString());
            price = price + gift[i].getPrice();
            weight = weight + gift[i].getWeight();
        }
        System.out.println("Цена подарка: " + price + " руб");
        System.out.println("Вес подарка: " + weight + " кг");
    }
}