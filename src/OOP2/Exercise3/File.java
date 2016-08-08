package oop2.exercise3;

/**
 * Created by maxim on 21.07.2016.
 */
public class File extends Stationery {

    public File(String tm, int cost){
        super(tm, cost);
    }

    @Override
    public String getInformation() {
        return "File: " + getTradeMark() + ", " + getCost();
    }
}
