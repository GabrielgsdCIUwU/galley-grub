package edu.estatuas.items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ItemTest {
    @Test
    public void testExtra() {
        String extra = "cheese";
        Item item = new Item("Krabby Patty", 1.25, extra);

        assertEquals(extra, item.extra());
    }

    @Test
    public void testIsRegular() {
        String extra = "cheese";
        Item itemWithExtra = new Item("Krabby Patty", 1.25, extra);

        assertFalse(itemWithExtra.isRegular());

        Item itemRegular = new Item("Krabby Patty", 1.25);
        assertTrue(itemRegular.isRegular());
    }

    @Test
    public void testName() {
        String name = "Krabby Patty";
        Item item = new Item(name, 1.25);

        assertEquals(name, item.name());
    }

    @Test
    public void testPrice() {
        Double price = 1.25;
        Item item = new Item("Krabby Patty", price);

        assertEquals(price, item.price());
    }

    @Test
    public void testToString() {
        Item item = new Item("Krabby Patty", 1.25);

        String expected = "Krabby Patty....1,25$";

        assertEquals(expected, item.toString());
    }
}
