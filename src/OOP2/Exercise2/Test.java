package OOP2.Exercise2;

import OOP2.Exercise3.*;
import java.util.ArrayList;

/**
 * Напишите приложение, позволяющее вести учет
 * канцелярских товаров на рабочем месте сотрудника.
 * Определите полную стоимость канцтоваров у определенного сотрудника.
 *
 * (В решении использована иерархия канц. товаров из упр.3)
 */

public class Test {
    public static void main(String[] args) {

        Employee w1 = new Employee("Вася", "Пупкин");

        StationeryList starterPack = new StationeryList();
        starterPack.add(new Pen("Pilot", 15, "Blue"));
        starterPack.add(new Pencil("Brauberg", 10, "HB"));
        starterPack.add(new Stapler("Attache", 50));
        starterPack.add(new Ruler("ErichKrause", 12));

        w1.giveStationery(starterPack);
        w1.getInformation();
        System.out.println();
        w1.printStationaryList();
    }

}

/**        OUTPUT:
 First name:            Вася
 Last name:             Пупкин
 Total stationary cost: 87$

 Pen: Pilot, Blue, 15$
 Pencil: Brauberg, HB, 10$
 Stapler: Attache, 50$
 Ruler: ErichKrause, 12$

 */
