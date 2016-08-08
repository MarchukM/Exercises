package oop.exercise4;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Ford focus", 1200, 100);
        car.printInformation();

        System.out.println();

        Lorry lorry = new Lorry("Kamaz", 6000, 800, 6000);
        lorry.printInformation();

        System.out.println();

        lorry.setTradeMark("Zaz");
        lorry.printInformation();
    }
}
