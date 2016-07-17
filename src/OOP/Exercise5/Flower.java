package OOP.Exercise5;

/**
 * Необходимо реализовать иерархию цветов (для примера, пусть это
 * будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 * Создать несколько объектов-цветов. Собрать букет с определением
 * его стоимости. В букет может входить несколько цветов одного типа.
 */

public abstract class Flower {

    private double cost;

    public double getCost(){
        return cost;
    }

    protected void setCost(double cost){
        this.cost = cost > 0 ? cost : 1;
    }

}
