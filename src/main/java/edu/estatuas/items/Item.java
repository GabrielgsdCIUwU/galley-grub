package edu.estatuas.items;

import java.text.DecimalFormat;

import edu.estatuas.interfaces.Product;

public class Item implements Product {
    
    private String name;
    private Double price;
    private String extra;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Double price() {
        return price;
    }

    @Override
    public String extra() {
        return extra;
    }

    @Override
    public Boolean isRegular() {
        return Boolean.TRUE;
    }

    private String priceWithTwoDecimal() {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(price());
    }

    @Override
    public String toString() {
        return name() + "...." + priceWithTwoDecimal() + "$";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item item) {
            return this.name.equals(item.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
