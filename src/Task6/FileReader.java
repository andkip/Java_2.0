package Task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Задание №6: Есть входной файл с набором слов, написанных через пробел.
 * Необходимо:
 * Прочитать слова из файла.Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле.Вывести статистику на консоль.
 * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 *
 * @author Andrey Kiprushin
 */

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> textWords = new ArrayList<>();
        Map<String, Integer> wordCount = new HashMap<>();
        File file = new File("src/Task6/File.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            String fileWord = scan.next();
            textWords.add(fileWord.toLowerCase());
        }
        scan.close();
        Collections.sort(textWords);
        System.out.println(textWords);
        for (String word : textWords) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }
        int mostFrequent = (Collections.max(wordCount.values()));
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == mostFrequent) {
                System.out.println("Встречается больше всего: " + entry.getKey() + " - " + mostFrequent);
            }
        }
    }
}