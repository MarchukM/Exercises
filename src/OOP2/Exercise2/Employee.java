package OOP2.Exercise2;

import OOP2.Exercise3.Stationery;

import java.util.ArrayList;

/**
 * Created by maxim on 21.07.2016.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private StationeryList stationeryList;

    public Employee(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
        stationeryList = new StationeryList();
    }

    public void setLastName(String ln){
        lastName = ln;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void giveStationery(Stationery st){
        stationeryList.add(st);
    }

    public void giveStationery(ArrayList<Stationery> st){
        stationeryList.add(st);
    }

    public void giveStationery(Stationery[] st){
        stationeryList.add(st);
    }

    public void giveStationery(StationeryList st){
        stationeryList.add(st);
    }

    public void printTotalStationaryCost(){
        System.out.println(stationeryList.getTotalCost());
    }

    public void getInformation(){
        System.out.println("First name:            " + getFirstName());
        System.out.println("Last name:             " + getLastName());
        System.out.println("Total stationary cost: " + stationeryList.getTotalCost() + "$");
    }

    public void printStationaryList(){
        stationeryList.printList();
    }

}
