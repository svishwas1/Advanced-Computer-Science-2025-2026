import java.util.ArrayList;

public class CocoaRegister {

    public static final double TAX_RATE = 0.0875;

    @SuppressWarnings({"unused", "FieldMayBeFinal"})
    private ArrayList<Sellable> items;
    @SuppressWarnings({"unused", "FieldMayBeFinal"})
    private ArrayList<Integer> quantities;

    public CocoaRegister() {
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addItem(Sellable item, int quantity) {
        // TODO:
        // - if item is null OR quantity <= 0, do nothing
        // - otherwise, add item and quantity to the parallel ArrayLists
        if (item != null || quantity <= 0) {
            items.add(item);
            quantities.add(quantity);
        }
    }

    public double getSubtotal() {
        // TODO:
        // sum item.getBasePrice() * quantity for all line items
        // return rounded to 2 decimals using ChocolateBar.round2(...)
        double subtotal = 0;
        for (int i = 0; i < items.size(); i++) {
            subtotal += (items.get(i).getBasePrice() * quantities.get(i));
        }
        return ChocolateBar.round2(subtotal);
    }

    public double getTax() {
        // TODO:
        // tax = subtotal * TAX_RATE, rounded to 2 decimals
        return ChocolateBar.round2(getSubtotal() * TAX_RATE);
    }

    public double getTotal() {
        // TODO:
        // total = subtotal + tax, rounded to 2 decimals
        return ChocolateBar.round2(getSubtotal() + getTax());
    }

    public void printReceipt() {
        // TODO: Print EXACTLY the required receipt format.
        //
        // Hints:
        // - Header line: "== COCOA CORNER =="
        System.out.println("== COCOA CORNER ==");
        // - For each line item i:
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i+1) + ". " + items.get(i).getName() 
                + " x" + quantities.get(i) + " @ $" + ChocolateBar.money(items.get(i).getBasePrice()) 
                + " = $" + ChocolateBar.money(items.get(i).getBasePrice() * quantities.get(i)));
        }
        System.out.println("Subtotal: $" + ChocolateBar.money(getSubtotal()));
        System.out.println("Tax: $" + ChocolateBar.money(getTax()));
        System.out.println("Total: $" + ChocolateBar.money(getTotal()));
        //   (i+1) + ". " + name + " x" + qty + " @ $" + unit + " = $" + lineTotal
        // - Use ChocolateBar.money(...) for all currency formatting
    }

}
