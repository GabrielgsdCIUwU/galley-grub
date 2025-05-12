package edu.estatuas.order;

import java.util.ArrayList;
import java.util.List;

import edu.estatuas.interfaces.Comanda;
import edu.estatuas.items.Item;
import edu.estatuas.items.ItemFactory;

public class Order implements Comanda {

    private Double total = 0d;
    private List<Item> listItems = new ArrayList<>();

    @Override
    public void addItem(String name, Double price) {
        itemList().add(ItemFactory.getItem(name, price));
    }

    @Override
    public void addItem(String name, Double price, String extra) {
        itemList().add(ItemFactory.getItem(name, price, extra));
    }

    @Override
    public int size() {
        return itemList().size();
    }

    @Override
    public List<Item> itemList() {
        return listItems;
    }

    @Override
    public Double getTotal() {
        return total;
    }

    @Override
    public void updateTotal(Double total) {
        this.total += total;
    }

    @Override
    public void display() {
        System.out.println("\n--- ORDER ---");
        itemList().stream().forEach(System.out::println);
    }
    
}
