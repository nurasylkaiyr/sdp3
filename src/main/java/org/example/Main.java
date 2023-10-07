package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"iPhone 14", "Samsung Galaxy S22", "Google Pixel 6"};
        double[] prices = {700, 600, 500};

        System.out.println("Available Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - $" + prices[i]);
        }

        System.out.print("Enter the product number to select: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= products.length) {
            Order basicOrder = new BasicOrder(prices[choice - 1], products[choice - 1]);

            Order giftWrappedOrder = new GiftWrapDecorator(basicOrder);
            Order finalOrder = new DiscountDecorator(giftWrappedOrder, 0.3);

            double totalCost = finalOrder.calculateTotal();
            String orderDescription = finalOrder.getDescription();

            System.out.println("Order Description: " + orderDescription);
            System.out.println("Total Cost: $" + totalCost);
        } else {
            System.out.println("Invalid choice. Please select a number between 1 and " + products.length);
        }

        scanner.close();
    }
}