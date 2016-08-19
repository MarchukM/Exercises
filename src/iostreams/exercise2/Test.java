package iostreams.exercise2;

/*
 *  Задание 2. Работа с символьными потоками ввода-вывода
 *  Прочитайте файл, содержащий код на языке Java. Определите,
 *  какие ключевые слова языка Java это код содержит.
 *  Выведите эти слова и их количество в другой файл.
 *  Используйте только символьные потоки ввода-вывода.
 */

import java.io.File;

public class Test {
    public static void main(String[] args) {

        File inputFile = new File("D:/Java/Exercises/src/iostreams/exercise2/Test.java");
        File outputFile = new File("D:/Java/Exercises/src/iostreams/exercise2/Output.txt");
        KeyWords k  = new KeyWords();
        k.findKeywordsInTheFile(inputFile);
        k.writeResultsIntoTheFile(outputFile);
        k.print();
    }
}
