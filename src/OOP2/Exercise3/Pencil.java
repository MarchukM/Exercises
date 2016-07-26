package OOP2.Exercise3;

/**
 * Created by maxim on 21.07.2016.
 */
public class Pencil extends Stationery {

    private String hardness;

    public Pencil(String tm, int cost, String hardness){
        super(tm, cost);
        setHardness(hardness);
    }

    public void setHardness(String hardness){
        this.hardness = hardness;
    }

    public String getHardness(){
        return hardness;
    }

    @Override
    public String getInformation() {
        return "Pencil: " + getTradeMark() + ", " + getHardness() + ", " + getCost() + "$";
    }
}
