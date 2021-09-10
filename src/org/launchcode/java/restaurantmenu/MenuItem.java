package org.launchcode.java.restaurantmenu;

import java.util.Date;

public class MenuItem {
    private double price;
    private String name;
    private String description;
    private Date dateAdded = new Date();

    public MenuItem(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.dateAdded = new Date();
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

    public Date getDateAdded(){
        return dateAdded;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.name = description;
    }

}
