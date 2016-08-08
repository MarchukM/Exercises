package oop.exercise1;

/**
 *  Составить описание класса для представления комплексных чисел с возможностью задания
 *  вещественной и мнимой частей как числами типов double, так и целыми числами.
 *  Обеспечить выполнение операций сложения, вычитания и умножения комплексных чисел.
 */

public class Complex {
    private double re = 0;
    private double im = 0;


    public Complex(double r, double i){
        re = r;
        im = i;
    }

    public double getRe(){
        return re;
    }

    public double getIm(){
        return im;
    }

    public Complex addition(Complex a){
        return new Complex(re + a.getRe(), im + a.getIm());
    }

    public Complex subtraction(Complex a){
        return new Complex(re - a.getRe(), im - a.getIm());
    }

    public Complex multiplication(Complex a){
        double resRe = (re * a.getRe()) + (im * a.getIm()) * (-1);
        double resIm = (im * a.getRe()) + (re * a.getIm());
        return new Complex(resRe, resIm);
    }


    public void print(){
        if(re == 0 && im != 0){
            System.out.println(im + "i");
            return;
        }
        if(im == 0 && re != 0){
            System.out.println(re);
            return;
        }
        if(im > 0){
            System.out.println(re + "+" + im + "i");
        }else{
            System.out.println(re + "" + im + "i");
        }
    }
}
