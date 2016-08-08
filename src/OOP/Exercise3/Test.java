package oop.exercise3;


/**
 * Создать класс Man (человек), с полями: имя, возраст, пол и вес.
 * Определить методы задания имени, возраста и веса.
 * Создать производный класс Student, имеющий поле года обучения.
 * Определить методы задания и увеличения года обучения.
 */

public class Test {

    public static void main(String[] args) {
        Man randomMan = new Man();
        randomMan.printInformation();

        System.out.println();

        Man man = new Man("Петр", "Петрович", true, 13, 200);
        man.printInformation();

        System.out.println();

        Student st = new Student();
        st.printInformation();

        System.out.println();

        Student st2 = new Student("Мария", "Ивановна", true, 65, 150, 45);
        st2.printInformation();

        st2.toTheNextCourse();
        System.out.println();
        st2.printInformation();
    }

}
