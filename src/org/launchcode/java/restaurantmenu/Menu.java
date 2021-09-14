package org.launchcode.java.restaurantmenu;

import java.util.*;

public class Menu {
    private ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
    private String menuType;
    private static float dateUpdated = System.currentTimeMillis();

    public Menu(ArrayList<MenuItem> menu, String menuType){
        this.menuList = menu;
        this.menuType = menuType;
    }

    public ArrayList<MenuItem> getMenuList(){
        return menuList;
    }

    public String getMenuType(){
        return menuType;
    }

    public void setMenuList(ArrayList<MenuItem> menuList){
        this.menuList = menuList;
    }

    public String findAndPrintItem(String searchQuery){
        String itemToReturn = "";
        for(MenuItem item : menuList) {
            if (item.getName().equals(searchQuery)) {
                itemToReturn = item.toString();
            }
        }
        return itemToReturn;
    }

    public void findAndDeleteItem(String searchQuery){

        for(int i = 0; i < menuList.size(); i++){
            if(menuList.get(i).getName().equals(searchQuery)) {
                menuList.remove(i);
            }
        }
    }

    public void addNewMenuItem(MenuItem newItem){
        String alreadyExists = "";

        for (MenuItem item : menuList) {
            if (item.equals(newItem)) {
                alreadyExists = newItem.getName() + " Already Exists, Try again!";
            }
        }

        if(!menuList.contains(newItem)){
            menuList.add(newItem);
        } else {
            alreadyExists = newItem.getName() + " Already Exists, Try again!";
        }

        System.out.println(alreadyExists);

    }

    @Override
    public String toString(){
        String builder = "";
        for(MenuItem item : menuList){
            builder += item.toString();
        }
        return builder;
    }

}
