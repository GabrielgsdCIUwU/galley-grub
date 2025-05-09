package edu.estatuas.interfaces;

import java.util.List;

import edu.estatuas.items.Item;

public interface Comanda {
    void addItem(String name, Double price);
    void addItem(String name, Double price, String extra);
    int size();
    List<Item> itemList();
    Double getTotal();
    void updateTotal(Double total);
    void display();
}
