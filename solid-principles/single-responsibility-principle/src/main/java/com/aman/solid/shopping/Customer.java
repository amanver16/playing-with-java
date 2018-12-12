package com.aman.solid.shopping;

import java.util.HashMap;
import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {

        HashMap<String, Integer> purchasedItemsMap = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to Online Shopping");        

        do {

            System.out.println("\nSelect items to purchase :\n");

            System.out.println("1. HP Laptop @50000");
            System.out.println("2. Gaming Mouse @800");
            System.out.println("3. Keyboard @500");
            System.out.println("4. Headphone @2000");
            System.out.println("5. Cooling Pad @5000");

            System.out.println("\n6. Place Order");

            int choice = scanner.nextInt();

            if (choice == 1) {
                purchasedItemsMap.put("HP Laptop", 50000);
            } else if (choice == 2) {
                purchasedItemsMap.put("Gaming Mouse", 800);
            } else if (choice == 3) {
                purchasedItemsMap.put("Keyboard", 500);
            } else if (choice == 4) {
                purchasedItemsMap.put("Headphone", 2000);
            } else if (choice == 5) {
                purchasedItemsMap.put("Cooling Pad", 5000);
            } else if (choice == 6) {
                PlaceOrderService placeOrderService = new PlaceOrderService();
                CalculateBillService calculateBillService = new CalculateBillService();
                placeOrderService.placeOrder(purchasedItemsMap);
                System.out.println("Total bill amount is : " + calculateBillService.calculateBill(purchasedItemsMap));
                break;
            } else {
                System.out.println("Wrong Choice !!!");
            }

        } while (true);

        System.out.println("\nApplication Terminated.");
        scanner.close();

    }

}