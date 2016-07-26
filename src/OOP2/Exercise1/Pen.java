package OOP2.Exercise1;

/**
 * Created by maxim on 20.07.2016.
 */
public class Pen {

    private String tradeMark;
    private String color;
    private int cost;


    public Pen(String tradeMark, String color, int cost){
        this.tradeMark = tradeMark;
        this.color = color;
    }

    public void setCost(int cost){
        this.cost = cost > 0 ? cost : 5;
    }

    public String getTradeMark(){
        return tradeMark;
    }

    public String getColor(){
        return color;
    }

    public int getCost(){
        return cost;
    }

    public boolean equals(Object anObject){
        if(this == anObject){
            return true;
        }
        if(anObject == null){
            return false;
        }
        if(!(anObject instanceof Pen)){
            return false;
        }

        Pen tempPen = (Pen)anObject;

        if(tradeMark != tempPen.getTradeMark()){
            return false;
        }
        if(color != tempPen.getColor()){
            return false;
        }
        if(cost != tempPen.getCost()){
            return false;
        }

        return true;
    }

    public int hashCode(){
        int hash = 0;

        hash += tradeMark == null ? 0 : tradeMark.hashCode();
        hash += color == null ? 0 : tradeMark.hashCode();
        hash += 31*cost;

        return hash;
    }

    public String toString(){
        return getClass().getName() + " @ " + "Trademark: " + tradeMark + ", Color: " + color
                + ", Cost: " + cost;
    }

}
