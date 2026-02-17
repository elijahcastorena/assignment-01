public static void printInventory(String[] names, double[] prices, int[] stocks){
    for (int i = 0; i < names.length; i++){
        if (names[i] != null){
            System.out.printf("%s -- $%.2f -- %d in stocks.%n", names[i], prices[i], stocks[i]);
        }
    }
}