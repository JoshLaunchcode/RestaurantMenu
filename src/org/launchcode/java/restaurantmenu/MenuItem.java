package org.launchcode.java.restaurantmenu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private static int itemIdCounter = 1;
    private int itemId = incrementItemId();
    private double price;
    private String name;
    private String description;
    private final static float dateAdded = System.currentTimeMillis();

    public MenuItem(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    private int incrementItemId(){
        itemIdCounter++;
        return itemIdCounter;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public Float getDateAdded(){ return dateAdded; }

    public void setPrice(double price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.name = description;
    }

    @Override
    public String toString(){
        return "\n******\nName: " + name + "\nPrice: " + price + "\nDescription: " + description + "\n******\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name == menuItem.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
