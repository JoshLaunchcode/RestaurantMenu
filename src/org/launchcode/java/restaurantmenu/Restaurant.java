package org.launchcode.java.restaurantmenu;

import java.sql.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class Restaurant {
    public static void main (String[] args){
        MenuItem hamburger = new MenuItem(2.99, "Hamburger", "Burger with some patties");
        MenuItem cheeseburger = new MenuItem(3.99, "Cheeseburger", "Like a hamburger but with cheese");
        MenuItem coke = new MenuItem(1.00, "Coca Cola", "Ice Cold Coco Cola");
        MenuItem[] lunchMenuArray = new MenuItem[]{hamburger, cheeseburger, coke};

        MenuItem spaghetti = new MenuItem(7.99, "Spaghetti", "Noodles and red sauce");
        MenuItem pizza = new MenuItem(8.99, "Pizza", "Pizza dough with cheese and sauce");
        MenuItem wine = new MenuItem(20.99, "Wine", "Red Wine");
        MenuItem beer = new MenuItem(5.99, "Beer", "Tastes like watered down sadness");
        MenuItem[] dinnerMenuArray = new MenuItem[]{spaghetti, pizza, wine};

        ArrayList<MenuItem> lunchMenuList = new ArrayList<>(Arrays.asList(lunchMenuArray));
        ArrayList<MenuItem> dinnerMenuList = new ArrayList<>(Arrays.asList(dinnerMenuArray));

        Menu lunchMenu = new Menu(lunchMenuList, "Lunch Menu");
        Menu dinnerMenu = new Menu(dinnerMenuList, "Dinner Menu");

        System.out.println(dinnerMenu.toString());
        System.out.println("--------------- Just Pizza Next");
        System.out.println(dinnerMenu.findAndPrintItem("Pizza"));

        dinnerMenu.findAndDeleteItem("Pizza");
        System.out.println("--------------- Pizza Removed");
        System.out.println(dinnerMenu.toString());

        dinnerMenu.addNewMenuItem(pizza);
        System.out.println("--------------- Added Pizza Back");
        System.out.println(dinnerMenu.toString());

        dinnerMenu.addNewMenuItem(beer);
        System.out.println("--------------- Added Beer");
        System.out.println(dinnerMenu.toString());

        System.out.println("--------------- Trying to Add an Existing Item");
        dinnerMenu.addNewMenuItem(beer);
    }

}
