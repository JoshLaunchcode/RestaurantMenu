package org.launchcode.java.restaurantmenu;

import java.util.*;

public class Menu {
    private HashMap<String, ArrayList<MenuItem>> menuList = new HashMap<String, ArrayList<MenuItem>>();
    private String menuType;
    private Date dateUpdated;

    public Menu(ArrayList<MenuItem> appetizer, ArrayList<MenuItem> mainCourse, ArrayList<MenuItem> dessert, String menuType){
        this.menuList.put("Appetizer", appetizer);
        this.menuList.put("Main Course", mainCourse);
        this.menuList.put("Dessert", dessert);
        this.menuType = menuType;
        this.dateUpdated = new Date();
    }

    public HashMap<String, ArrayList<MenuItem>> getMenuList(){
        return menuList;
    }

    public ArrayList<MenuItem> getAppetizers(){
        return menuList.get("Appetizer");
    }

    public ArrayList<MenuItem> getMainCourse(){
        return menuList.get("Main Course");
    }

    public ArrayList<MenuItem> getDessert(){
        return menuList.get("Dessert");
    }

    public String getMenuType(){
        return menuType;
    }

    public void setMenuList(ArrayList<MenuItem> appetizer, ArrayList<MenuItem> mainCourse, ArrayList<MenuItem> dessert){
        this.menuList.put("Appetizer", appetizer);
        this.menuList.put("Main Course", mainCourse);
        this.menuList.put("Dessert", dessert);
        this.dateUpdated = new Date();
    }

}
