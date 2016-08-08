package oop2.exercise2;

import oop2.exercise3.Stationery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StationeryList {
    private ArrayList<Stationery> stationery;

    class TrademarkCompare implements Comparator<Stationery>{
        @Override
        public int compare(Stationery o1, Stationery o2) {
            return o1.getTradeMark().compareTo(o2.getTradeMark());
        }
    }

    public StationeryList(){
        stationery = new ArrayList<Stationery>();
    }

    public StationeryList(ArrayList<Stationery> st){
        stationery = new ArrayList<Stationery>(st);
    }

    public StationeryList(Stationery[] st){
        this();
        add(st);
    }

    public StationeryList(StationeryList st){
        this();
        add(st);
    }

    public Stationery getStationery(int index){
        return stationery.get(index);
    }

    public int getSize(){
        return stationery.size();
    }

    public void add(StationeryList st) {
        for (int i = 0; i < st.getSize(); i++) {
            stationery.add(st.getStationery(i));
        }
    }

    public void add(Stationery st){
        stationery.add(st);
    }

    public void add(ArrayList<Stationery> st){
        stationery.addAll(st);
    }

    public void add(Stationery[] st){
        for(int i = 0; i < st.length; i++){
            stationery.add(st[i]);
        }
    }

    public int getTotalCost(){
        int totalCost = 0;
        for(Stationery st : stationery){
            totalCost += st.getCost();
        }
        return  totalCost;
    }

    public void printList(){
        for(Stationery s : stationery){
            System.out.println(s.getInformation());
        }
    }

    public void remove(int index){
        stationery.remove(index);
    }

    public void sortByTrademark(){
        TrademarkCompare tmCmp = new TrademarkCompare();
        Collections.sort(stationery,tmCmp);
    }

    public void sortByCost(){
        Collections.sort(stationery);
    }

}
