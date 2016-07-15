package OOP.Exercise2;

import java.rmi.MarshalException;

/**Создайте класс с именем Fraction, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.
 * Конструктор класса должен инициализировать их заданным набором значений. Создайте метод класса,
 * который будет выводить дробь в текстовую строку в формате x / y;
 * метод, добавляющий (сложение) к текущей дроби дробь,
 * переданную ему в параметре и возвращающий дробь - результат сложения;
 * метод, умножающий (произведение) текущую дробь на число типа double,
 * переданное ему в параметре и возвращающий дробь - результат умножения;
 * метод, делящий (деление) текущую дробь на число типа double,
 * переданное ему в параметре и возвращающий дробь - результат деления.
 */

public class Test{


    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(-5, 2);
        Fraction f3 = new Fraction(-3.5);
        Fraction f4 = new Fraction(99);

        f1.print(); // 1/3
        f2.print(); // -5/2
        f3.print(); // -7/2
        f4.print(); // 99/1

        f1.addition(f2).print(); // -13/6
        f1.addition(f3).print(); // -19/6
        f1.addition(5).print(); // 2/1
        f3.addition(-2.5).print(); // -6/1

        f1.multiplication(f2).print(); // -5/6
        f1.multiplication(2).print(); // 2/3
        f1.multiplication(-2.46).print(); // -41/50

        f1.division(f2).print(); // -2/15
        f1.division(60).print(); // 1/180
        f1.division(5.398).print(); //500/8097
    }

}
