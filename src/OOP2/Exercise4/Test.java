package oop2.exercise4;

import oop2.exercise2.StationeryList;
import oop2.exercise3.*;

/**
 * Задание 4. Интерфейсы
 * Используйте “набор новичка”, созданный в задании 3, (или любую другую коллекцию объектов);
 * отсортируйте вещи в этом наборе по стоимости, по наименованию, по стоимости и наименованию.
 *
 * (по стоимости и наименованию - не понял как это)
 */

public class Test {
    public static void main(String[] args) {

        StationeryList starterPack = new StationeryList();

        starterPack.add(new Pen("Pilot", 15, "Blue"));
        starterPack.add(new Pencil("Brauberg", 10, "HB"));
        starterPack.add(new Stapler("Attache", 50));
        starterPack.add(new Ruler("ErichKrause", 12));

        starterPack.printList();
        System.out.println();

        starterPack.sortByCost();
        starterPack.printList();
        System.out.println();

        starterPack.sortByTrademark();
        starterPack.printList();
    }
}
