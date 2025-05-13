package edu.estatuas.items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class RetailPriceTest {
    @Test
    public void testGetPrice() {
        RetailPrice.initPrices();

        String[] extras = {"cheese", "sauce", "medium", "large"};
        Double[] prices = {0.25, 0.5, 0.25, 0.5};

        for (int i=0; i < extras.length; i++) {
            assertEquals(prices[i], RetailPrice.getPrice(extras[i]));
        }

        assertNull(RetailPrice.getPrice("Not valid Item"));
        
    }
}
