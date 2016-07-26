package OOP2.Exercise3;

/**
 * Created by maxim on 21.07.2016.
 */
public class Ruler extends Stationery {

    public Ruler(String tm, int cost){
        super(tm, cost);
    }

    @Override
    public String getInformation() {
        return "Ruler: " + getTradeMark() + ", " + getCost() + "$";
    }
}
