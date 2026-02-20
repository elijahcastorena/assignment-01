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

// prints information of index i if not null
public static void printInventory(String[] names, double[] prices, int[] stocks){
    for (int i = 0; i < names.length; i++){
        if (names[i] != null){
            System.out.printf("%s -- $%.2f -- %d in stocks.%n", names[i], prices[i], stocks[i]);
        }
    }
}

/** Prints Menu and calls functions according to user input. */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] itemNames = new String[10];
    double[] itemPrices = new double[10];
    int[] itemStocks = new int[10];


    System.out.println("--- Grocery Management System Menu ---");
    System.out.println("1. View");
    System.out.println("2. Restock");
    System.out.println("3. Exit");
    System.out.print("Enter 1-3: ");
    int choice = input.nextInt();
    while (true) { 

        while (choice > 3 || choice <= 0) {
            System.out.println("New Input Required");
            System.out.println("--- Grocery Management System Menu ---");
            System.out.println("1. View");
            System.out.println("2. Restock");
            System.out.println("3. Exit");
            System.out.print("Enter 1-3: ");
            choice = input.nextInt();                
        }

        switch (choice) {
            case 1:
                printInventory(itemNames, itemPrices, itemStocks);
                choice = 4;
                break;
            case 2:
                input.nextLine();
                System.out.print("Enter product to restock: ");
                String target = input.nextLine();
                System.out.print("Enter amount to restock: ");
                int addedStock = input.nextInt();
                restockItem(itemNames, itemStocks, target, addedStock);
                choice = 4;
                break;
            case 3:
                System.out.println("Exiting");
                input.close();
                return;
        }
    }
}