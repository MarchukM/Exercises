package iostreams.exercise1;



public class Car {

    private String tradeMark;
    private int weight;
    private double power;

    public Car(String tradeMark, int weight, double power){
        setTradeMark(tradeMark);
        setWeight(weight);
        setPower(power);
    }

    public void setTradeMark(String tr){
        tradeMark = tr;
    }

    public String getTradeMark(){
        return tradeMark;
    }

    public void setWeight(int weight){
        this.weight = weight > 0 ? weight : 100;
    }

    public int getWeight(){
        return weight;
    }

    public void setPower(double power){
        this.power = power > 0 ? power : 10;
    }

    public double getPower(){
        return power;
    }

    public void printInformation(){
        System.out.println("Trademark: " + getTradeMark());
        System.out.println("Weight:    " + getWeight() + "kg");
        System.out.println("Power:     " + getPower() + "hp");
    }
}
