package edu.estatuas.order;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.estatuas.items.Item;
import edu.estatuas.items.ItemFactory;

public class OrderTest {
    @Test
    public void testAddItem() {
        Order order = new Order();
        String name = "Krabby Patty";
        Double price = 1.25;

        Item item = ItemFactory.getItem(name, price);

        order.addItem(name, price);

        assertEquals(1, order.size());
        assertEquals(item, order.itemList().get(0));
    }

    @Test
    public void testAddItem2() {
        Order order = new Order();
        String name = "Krabby Patty";
        Double price = 1.25;
        String extra = "cheese";

        Item item = ItemFactory.getItem(name, price, extra);

        order.addItem(name, price, extra);

        assertEquals(1, order.size());
        assertEquals(item, order.itemList().get(0));
    }

    @Test
    public void testGetSetTotal() {
        Order order = new Order();

        Double total = 50.45;

        order.updateTotal(total);

        assertEquals(total, order.getTotal());

    }


    @Test
    public void testSize() {
        Order order = new Order();
        String name = "Krabby Patty";
        Double price = 1.25;
        String extra = "cheese";

        order.addItem(name, price);
        order.addItem(name, price, extra);

        assertEquals(2, order.size());
    }
}
