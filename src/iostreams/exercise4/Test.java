package iostreams.exercise4;

/* Дана коллекция фильмов, содержащая информацию об актерах,
 * снимавшихся в главных ролях (один актер мог сниматься и в нескольких фильмах).
 * Необходимо написать приложение, позволяющее при запуске восстанавливать коллекцию
 * фильмов, позволять ее модифицировать, а по завершении работы приложения – сохранять (в файл).
 * Для восстановления/сохранения коллекции использовать  сериализацию/десериализацию.
 */


import java.io.*;

public class Test {

    public void serialize(Object o) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.out"));
        oos.writeObject(o);
        oos.flush();
        oos.close();
    }

    public Object deserialize(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Object o = ois.readObject();
        ois.close();
        return o;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FilmsCollection collection = new FilmsCollection();

        Film film1 = new Film("Die Hard");
        film1.addActor("Bruce Willis");
        film1.addActor("Alan Rickman");
        film1.addActor("Alexander Godunov");
        film1.addActor("Bonnie Bedelia");

        Film film2 = new Film("Terminator 2: Judgment Day");
        film2.addActor("Arnold Schwarzenegger");
        film2.addActor("Linda Hamilton");
        film2.addActor("Robert Patrick");

        collection.addFilm(film1);
        collection.addFilm(film2);
        collection.print();

        Test t = new Test();
        t.serialize(collection);
        FilmsCollection col = (FilmsCollection) t.deserialize("test.out");
        col.print();
    }
}
