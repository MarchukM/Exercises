package oop.exercise5;

/**
 * Необходимо реализовать иерархию цветов (для примера, пусть это
 * будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 * Создать несколько объектов-цветов. Собрать букет с определением
 * его стоимости. В букет может входить несколько цветов одного типа.
 */


public class Test {
    public static void main(String[] args) {

        Flower[] bouquet = new Flower[5];

        bouquet[0] = new Tulip();
        bouquet[1] = new Tulip();
        bouquet[2] = new Carnation();
        bouquet[3] = new Rose();
        bouquet[4] = new Rose();


        double bouquetCost = 0;
        for(int i = 0; i < bouquet.length; i++){
            bouquetCost += bouquet[i].getCost();
        }

        System.out.println("Bouquet cost: " + bouquetCost + "$");
    }
}
