public class Inventory {
    private String itemName;
    private int quantity;
    private int price;

    Inventory(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = (int) price;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override 
    public String toString() {
        return ("Item: " + itemName + ", Quantity: " + quantity + ", Price: $" + price);
    }

    public boolean equals(Inventory other) {
        return this.itemName.equals(other.itemName) && 
            this.quantity == other.quantity 
            && this.price == other.price;
    }

    public int raisePrice(double percentage) {
        double percentDecimal = percentage / 100;
        price = (int) (price * percentDecimal);
        return price;

    }
}