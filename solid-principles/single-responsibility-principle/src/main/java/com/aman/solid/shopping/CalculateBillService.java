package com.aman.solid.shopping;

import java.util.HashMap;

public class CalculateBillService {

    public long calculateBill(HashMap<String, Integer> purchasedItemsMap) {

        long totalBill = 0;

        for (long itemPrice : purchasedItemsMap.values()) {
            totalBill += itemPrice;
        }

        return totalBill;

    }

}