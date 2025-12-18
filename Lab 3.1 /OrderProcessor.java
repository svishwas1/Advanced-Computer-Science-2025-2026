public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        String[] expensiveItemsTemp = new String[items.length];

        //Getting the subtotal by calculateSubtotal instead of looping through each item here and calculating the subtotal
        //Was able to get rid of setting subtotal to zero here because the calculateSubtotal methods does this
        double subtotal = calculateSubtotal(items);

        //Getting the premiumCount instead of looping through each item here and checking if it is a premium item
        // This method also updates expensiveItemsTemp with another method called checkExpensive
        //Was able tp get rid of setting premiumCount to zero here because the calculatePremiumCount method does this
        int premiumCount = calculatePremiumCount(items, expensiveItemsTemp);

        // This does trim premium items to exact sizes by utilizing a new method called premiumArray
        //premiumArray returns the new array and is stored in expensiveItems and copies the expensive items from expensiveItemsTemp
        //Makes it cleaner and splits into a new method without having to copy over the array in this method
        String [] expensiveItems = premiumArray(expensiveItemsTemp, premiumCount);

        //Calculates tax by using the calculateTax method without having to do the calculations here makes it cleaner
        //Stores the tax value given by calculateTax in the tax variable 
        double tax = calculateTax(subtotal, taxRate);

        //Calculates total by using the calculateTotal method without having to do the calculations here makes it cleaner
        //Stores the total value given by calculateTotal in the total variable 
        double total = calculateTotal(tax, subtotal);

        //Created a new method display that takes all the values and prints them for the user
        //Moved to a new method so that the processCustomerOrder will be cleaner than having a lot of print statements
        display(subtotal, tax, total, premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    } 

    //This method loops through items and gives the quantity and price to a new method findingTotal
    //The total price of this item (calculated by findingTotal) is added to subtotal
    //This reduces calculating the subtotal into two new methods which looks simpler
    public static double calculateSubtotal(Item[] items) {
        double subtotal = 0;
        for (Item item : items) {
            double price = item.getPrice();
            int quantity = item.getQuantity();
            subtotal += findingTotal(quantity, price);
        }
        return subtotal;
    }

    //This method loops through items and checks if they are expensive by using the checkExpensive method
    //Then based on if the item is expensive updates the expensiveItemsTemp list with the expensive items 
    //Also adds to the premium count if it is expensive 
    //Helps to break up this code from the processCustomerOrder method into other methods 
    public static int calculatePremiumCount(Item[] items, String[] expensiveItemsTemp) {
        int premiumCount = 0;
        for (Item item : items) {
            if (checkExpensive(item.getPrice(), item.getName())) {
                expensiveItemsTemp[premiumCount] = item.getName();
                premiumCount++;
            }
        }
        return premiumCount;
    }

    // New method to calculate item total so that all of this code is not squished together 
    //Returns the item total to calculateSubtotal so that calculateSubtotal can add this value to its subtotal
    //Helps to split calculateSubtotal so that there are not too much calculations going on in the same method 
    public static double findingTotal(int quantity, double price) {
        double itemTotal = price * quantity;
        return itemTotal;
    }

    //Replaced this code in the processCustomerOrder into a new method
    //calculatePremiumCount gives each item to check if it is expensive 
    //Based on its expense it prints out certain messages
    //Then returns a boolean saying if the item was expensive or not back to calculatePremiumCount
    //Helps to split up the calculations in calculatePremiumCount
    public static boolean checkExpensive(double price, String name) {
        if (price > 50.0) {
            System.out.println(name + " is a premium item at $" + price);
            return true;
        } else {
            System.out.println(name + " is a regular item at $" + price);
        }
        return false;
    }

    //Calculates the tax in its own new method so that the processCustomerOrder method can be cleaner 
    //Also split the if statement so that this if statement just calculates tax not total at the same time 
    //Tax and total was split since only one value can be returned from the method without having to get too complex
    public static double calculateTax(double subtotal, double taxRate) {
        double tax = 0;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
        } 
        return tax;
    }

    //Calculates the total in its own new method so that the processCustomerOrder method can be cleaner 
    //Also split the if statement so that this if statement just calculates total not tax at the same time 
    //Tax and total was split since only one value can be returned from the method without having to get too complex
    public static double calculateTotal(double tax, double subtotal) {
        if (tax != 0) {
            return tax + subtotal;
        } else {
            return 0;
        }
    }

    //Prints the values of subtotal, tax, total and number of premium items in its own method 
    //This makes processCustomerOrder cleaner
    public static void display(double subtotal, double tax, double total, int premiumCount) {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);
    }

    //This method loops over expensiveItemsTemp and copys it over to a new array
    //The new array that is created is the correct length for the number of premium items
    //Returns this new array to be stored in expensiveItems string array in the processCustomerOrder method
    public static String[] premiumArray(String[] expensiveItemsTemp, int premiumCount) {
        String[] expensiveItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
        }
        return expensiveItems;
    }
}