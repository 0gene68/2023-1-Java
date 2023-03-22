package ch06;

/*
 * GameCharacter class: models the character that appears in the game
 * ArrayList object: Stores various items that a character has
 * add() : Adds an item to the ArrayList
 * print() : prints all items currently in possession
 * 
 * GameItem class: Represents an item, and is defined as an inner class in the GameCharacter class. Item properties include name, type, and price.
 * getPrice() : returns the price of the item
 * toString(): Returns item information in a string
 */

import java.util.ArrayList;

public class GameCharacter {
    private class GameItem {
        String name;
        int type;
        int price;

        public int getPrice(){
            return price;
        }

        @Override
        public String toString(){
            return "[name = " + name + ", type = " + type + ", price = " + price + "]";
        }
    }

    private ArrayList<GameItem> list = new ArrayList<GameItem>();

    public void add(String name, int type, int price){
        GameItem item = new GameItem();
        item.name = name;
        item.type = type;
        item.price = price;
        list.add(item);
    }

    public void print(){
        int total = 0;
        for(GameItem item : list){
            System.out.println(item);
            total += item.getPrice();
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        GameCharacter charac = new GameCharacter();
        charac.add("Sword", 1, 100);
        charac.add("Gun", 2, 50);
        charac.print();
    }
}
