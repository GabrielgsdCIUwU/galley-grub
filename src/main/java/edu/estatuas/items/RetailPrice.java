package edu.estatuas.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RetailPrice {
    private static Map<String, Double> prices = new HashMap<>();

    public RetailPrice(){}

    public static void initPrices() {
        List<String> names = new ArrayList<>(Arrays.asList("cheese", "sauce", "medium", "large"));
        List<Double> pricesEachElement = new ArrayList<>(Arrays.asList(0.25, 0.5, 0.25, 0.5));

        for (int i=0; i < Math.min(names.size(), pricesEachElement.size()); i++) {
            prices.put(names.get(i), pricesEachElement.get(i));
        }
    }

    public static void display() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            sb.append(entry.getKey() + "=" + entry.getValue()+ "\n");
        }

        System.out.println(sb.toString());
    }

    public static Double getPrice(String extra) {
        if (!prices.containsKey(extra)) {
            return null;
        }
        return prices.get(extra);
    }
}
