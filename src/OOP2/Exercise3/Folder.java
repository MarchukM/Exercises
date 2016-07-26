package OOP2.Exercise3;

/**
 * Created by maxim on 21.07.2016.
 */
public class Folder extends Stationery {

    public Folder(String tm, int cost){
        super(tm, cost);
    }

    @Override
    public String getInformation() {
        return "Folder: " + getTradeMark() + ", " + getCost() + "$";
    }
}
