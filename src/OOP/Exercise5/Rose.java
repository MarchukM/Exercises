package oop.exercise5;

/**
 * Необходимо реализовать иерархию цветов (для примера, пусть это
 * будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 * Создать несколько объектов-цветов. Собрать букет с определением
 * его стоимости. В букет может входить несколько цветов одного типа.
 */

public class Rose extends Flower{

    Rose(){
        setCost(12.2);
    }
}
