package oop.exercise4;

/**
 * Создать базовый класс Саг, характеризуемый торговой маркой (строка), весом,? мощностью.
 * Определить методы переназначения и изменения мощности.
 * Создать производный класс Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
 * Определить для него функции переназначения марки и изменения грузоподъемности.
 */

public class Lorry extends Car {

    protected double carrying;

    public Lorry(String tm, int w, double p, double carrying){
        super(tm, w, p);
        setCarrying(carrying);
    }


    public void setCarrying(double c){
        carrying = c > 0 ? c : 1000;
    }

    public double getCarrying(){
        return carrying;
    }

    public void printInformation(){
        super.printInformation();
        System.out.println("Carrying:  " + getCarrying() + "kg");
    }
}
