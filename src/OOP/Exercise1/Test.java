package OOP.Exercise1;

/**
 *  Составить описание класса для представления комплексных чисел с возможностью задания
 *  вещественной и мнимой частей как числами типов double, так и целыми числами.
 *  Обеспечить выполнение операций сложения, вычитания и умножения комплексных чисел.
 */

public class Test {
    public static void main(String[] args) {
        
        Complex z1 = new Complex(2, -2);
        Complex z2 = new Complex(2, 3);

        z1.addition(z2).print();
        z1.subtraction(z2).print();
        z1.multiplication(z2).print();

    }
}
