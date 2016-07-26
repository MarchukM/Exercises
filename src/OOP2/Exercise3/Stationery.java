package OOP2.Exercise3;


public abstract class Stationery implements Comparable<Stationery> {
    private String tradeMark;
    private int cost;

    @Override
    public int compareTo(Stationery o) {
        return cost - o.getCost();
    }

    public Stationery(String tradeMark, int cost){
        setTradeMark(tradeMark);
        setCost(cost);
    }

    public void setTradeMark(String tm){
        tradeMark = tm;
    }

    public String getTradeMark(){
        return tradeMark;
    }

    public void setCost(int cost){
        this.cost = cost > 0 ? cost : 5;
    }

    public int getCost(){
        return cost;
    }

    public abstract String getInformation();

}
