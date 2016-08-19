package iostreams.exercise3;

import java.io.*;

/* Задание 3. Работа с байтовыми и символьными потоками ввода-вывода
 * Дан файл, содержащий буквы текст на кириллице. Кодировка файла utf-8.
 * Прочитайте информацию из файла и перепишите ее в файл в кодировкой utf-16.
 */

public class Test {
    public static void main(String[] args) throws IOException {
        File f = new File(System.getProperty("user.dir") + "/src/iostreams/exercise3/test.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
        StringBuilder str = new StringBuilder();
        while(reader.ready()){
            str.append((char)reader.read());
        }
        reader.close();

        System.out.println(str);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f), "utf-16"));
        writer.write(str.toString());
        writer.flush();
        writer.close();


    }
}
