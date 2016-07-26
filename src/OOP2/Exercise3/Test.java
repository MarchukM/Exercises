package OOP2.Exercise3;

/**
 * Задание 3. Наследование
 * Разработайте иерархию канцелярских товаров.
 * Создайте “набор новичка”, используя созданную иерархию.
 */

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Stationery> starterPack= new ArrayList<Stationery>();

        starterPack.add(new Pen("Pilot", 15, "Blue"));
        starterPack.add(new Pencil("Brauberg", 10, "HB"));
        starterPack.add(new Stapler("Attache", 50));
        starterPack.add(new Ruler("ErichKrause", 12));

        for(Stationery s : starterPack){
            System.out.println(s.getInformation());
        }
    }
}
