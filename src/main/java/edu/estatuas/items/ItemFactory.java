package edu.estatuas.items;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {

    private ItemFactory() {}
    
    private static final Map<String, Item> itemMap = new HashMap<>();

    public static Item getItem(String name, Double price) {
        if (itemMap.containsKey(name)) {
            return itemMap.get(name);
        }

        Item item = new Item(name, price);
        itemMap.putIfAbsent(name, new Item(name, price));
        return item;
    }

    public static Item getItem(String name, Double price, String extra) {
        String nameKey = name + "w/ " + extra;
        if (itemMap.containsKey(nameKey)) {
            return itemMap.get(nameKey);
        }


        Item item = new Item(nameKey, price, extra);
        itemMap.putIfAbsent(nameKey, item);
        return item;
    }


}
