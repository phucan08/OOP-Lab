import java.util.ArrayList;

public class Order {
    private int id;
    private ArrayList<Item> items;

    public Order(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    // Calculate average cost of items
    public double calculateAverageCost() {
        if (items.isEmpty()) {
            return 0.0;
        }
        double totalCost = 0.0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }
        return totalCost / items.size();
    }

    // Get total number of items
    public int numberOfItems() {
        return items.size();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}