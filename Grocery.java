import java.util.Scanner;

// Adds index to amount in the stock if found, otherwise prints "Item not found."
public static void restockItem(String[] names, int[] stocks, String target, int amount) {
    boolean found = false;

    for (int i = 0; i < names.length; i++) {
        if (names[i] != null && names[i].equalsIgnoreCase(target)) {
            stocks[i] += amount;
            System.out.println("Restocked " + names[i] + ". New stock: " + stocks[i]);
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Item not found.");
    }
}