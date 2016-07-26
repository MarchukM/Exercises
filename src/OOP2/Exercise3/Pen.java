package OOP2.Exercise3;

/**
 * Created by maxim on 21.07.2016.
 */
public class Pen extends Stationery {

    private String color;

    public Pen(String tm, int cost, String color){
        super(tm, cost);
        setColor(color);
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String getInformation() {
        return "Pen: " + getTradeMark() + ", " + getColor() + ", " + getCost() + "$";
    }
}
