package OOP2.Exercise1;

/**
 * Задание 1. Принципы ООП, простейшие классы и объекты
 * Разработайте спецификацию и создайте класс Ручка (Pen).
 * Определите в этом классе методы equals(), hashCode() и toString().
 */


public class Test {

    public static void main(String[] args) {

        Pen p1 = new Pen("PILOT", "Blue", 30);
        Pen p2 = new Pen("Erich Krause", "Blue", 52);
        Pen p4 = new Pen("PILOT","Blue", 30);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p4.hashCode());

        System.out.println(p1.toString());
    }
}
