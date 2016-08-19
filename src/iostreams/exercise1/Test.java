package iostreams.exercise1;

import java.io.File;

/*
 * Задание 1. Работа с байтовыми потоками ввода-вывода
 * Прочитайте файл, содержащий код на языке Java.
 * Определите, какие ключевые слова языка Java это код содержит.
 * Выведите эти слова и их количество в другой файл.
 * Используйте только байтовые потоки ввода-вывода.
 */
public class Test {
    public static void main(String[] args) {
        File inputFile = new File("D:/Java/Exercises/src/iostreams/exercise1/Car.java");
        File outputFile = new File("D:/Java/Exercises/src/iostreams/exercise1/Output.txt");
        KeyWords w = new KeyWords();
        w.findKeywordsInTheFile(inputFile);
        w.writeResultsIntoTheFile(outputFile);
        w.print();

    }
}
