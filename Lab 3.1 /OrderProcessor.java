public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        double subtotal = 0;
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;

        for (Item item : items) {
            String name = item.getName();
            double price = item.getPrice();

            subtotal += findingTotal(item, subtotal, price);
            if (checkExpensive(price, premiumCount, expensiveItemsTemp, name) ) {
                premiumCount ++;
            }
        }

        // Trim premium items to exact size
        String[] expensiveItems = new String[premiumCount];
 
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
        }

        // Calculate tax and total
        double tax = calculateTax(subtotal, taxRate);
        double total = calculateTotal(tax, subtotal);

        display(subtotal, tax, total, premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }

    public static double findingTotal(Item item, double subtotal, double price) {
        int quantity = item.getQuantity();
        // Calculate item total
        double itemTotal = price * quantity;
        subtotal += itemTotal;

        return subtotal;
    }

    public static boolean checkExpensive(double price, int premiumCount, String[] expensiveItemsTemp, String name) {
        // Check if expensive
        if (price > 50.0) {
            expensiveItemsTemp[premiumCount] = name;
            System.out.println(name + " is a premium item at $" + price);
            return true;
        } else {
            System.out.println(name + " is a regular item at $" + price);
        }
        return false;
    }

    public static double calculateTax(double subtotal, double taxRate) {
        double tax = 0;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
        } 
        return tax;
    }

    public static double calculateTotal(double tax, double subtotal) {
        if (tax != 0) {
            return tax + subtotal;
        } else {
            return 0;
        }
    }

    public static void display(double subtotal, double tax, double total, int premiumCount) {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);
    }
}