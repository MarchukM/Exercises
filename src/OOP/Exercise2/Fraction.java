package OOP.Exercise2;

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

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(){
        setNumerator(0);
        setDenominator(1);
    }

    public Fraction(int num, int denom){
        setNumerator(num);
        setDenominator(denom);

    }

    public Fraction(double d){
        Fraction temp = convertingFromDouble(d);
        setNumerator(temp.getNumerator());
        setDenominator(temp.getDenominator());
        this.simplifyFraction();
    }

    public Fraction(int num){
        setNumerator(num);
        setDenominator(1);
    }

    public Fraction(Fraction f){
        setNumerator(f.getNumerator());
        setDenominator(f.getDenominator());
    }


    public void setNumerator(int num){
        numerator = num;
    }

    public void setDenominator(int denom){
        denominator = (denom != 0 ? denom : 1);
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }


    public void print(){
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction addition(Fraction f){
        Fraction result;
        int commonDenominator;
        int resultNumerator;

        if(denominator != f.getDenominator()){
            commonDenominator = denominator * f.getDenominator();
            resultNumerator = numerator * f.getDenominator()+ f.getNumerator() * denominator;
        }else{
            commonDenominator = denominator;
            resultNumerator = numerator + f.getNumerator();
        }

        result = new Fraction(resultNumerator, commonDenominator);
        result.simplifyFraction();

        return result;
    }

    public Fraction multiplication(Fraction f){
        Fraction result;

        int num = numerator * f.getNumerator();
        int denom = denominator * f.getDenominator();

        result = new Fraction(num, denom);
        result.simplifyFraction();

        return result;
    }

    public Fraction multiplication(int i){
        Fraction result = new Fraction(numerator * i, denominator);
        result.simplifyFraction();

        return result;
    }

    public Fraction multiplication(double d){
        Fraction temp = new Fraction(d);
        Fraction result = this.multiplication(temp);

        result.simplifyFraction();
        return result;
    }

    public Fraction division(Fraction f){
        Fraction result;

        int num = numerator * f.denominator;
        int denom = denominator * f.numerator;

        result = new Fraction(num, denom);
        result.simplifyFraction();

        return result;
    }

    public Fraction division(int i){
        Fraction temp = new Fraction(i);
        Fraction result = this.division(temp);

        return result;
    }

    public Fraction division(double d){
        Fraction temp = new Fraction(d);
        Fraction result = this.division(temp);

        return result;
    }


    public Fraction addition(int i){
        Fraction result = new Fraction(numerator + i, denominator);
        result.simplifyFraction();

        return result;
    }

    public Fraction addition(double d){
        Fraction result = new Fraction(d);
        result = result.addition(this);
        result.simplifyFraction();

        return result;
    }



    private Fraction convertingFromDouble(double d){
        int integerPart = Math.abs((int)d);
        int denom = 1000;
        int num = Math.abs((int)Math.round((Math.abs(d) - integerPart)*denom));
        num = integerPart*denom + num;

        if(d < 0){
            num = num * -1;
        }

        return new Fraction(num, denom);
    }

    public void simplifyFraction(){
        int gcm = greatestCommonMeasure(this);

        if(numerator <= 0 && denominator < 0){
            numerator = numerator * (-1);
            denominator = denominator * (-1);
        }
        if(numerator > 0 && denominator < 0){
            numerator = numerator * (-1);
            denominator = denominator * (-1);
        }

        this.numerator = this.numerator / gcm;
        this.denominator = this.denominator / gcm;
    }


    //Наибольший общий делитель
    private int greatestCommonMeasure(Fraction f){
        int x = -1;
        int greather;
        int less;

        if(f.getNumerator() > getDenominator()){
            greather = f.getNumerator();
            less = f.getDenominator();
        } else{
            less = f.getNumerator();
            greather = f.getDenominator();
        }

        if(less == 0){
            return 1;
        }

        while(x != 0) {
            x = greather % less;
            greather = less;
            less  = x;
        }

        return Math.abs(greather);
    }


}
