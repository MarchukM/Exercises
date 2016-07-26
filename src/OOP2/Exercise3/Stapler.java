package OOP2.Exercise3;

/**
 * Created by maxim on 21.07.2016.
 */
public class Stapler extends Stationery {

    public Stapler(String tm, int cost){
        super(tm, cost);
    }

    @Override
    public String getInformation() {
        StringBuffer buf = new StringBuffer("Stapler: ");
        buf.append(getTradeMark());
        buf.append(", ");
        buf.append(getCost() + "$");

        return buf.toString();
    }
}
