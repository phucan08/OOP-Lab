import java.util.Scanner;

public class OrderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get order ID
        System.out.print("Enter a new order ID: ");
        int orderId = sc.nextInt();

        // Create an Order object
        Order order = new Order(orderId);

        // Get the number of items in the order
        System.out.print("How many items in the order: ");
        int itemCount = sc.nextInt();

        // Add items to the order
        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Enter the ID for item " + i + ": ");
            int itemId = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter the name for item " + i + ": ");
            String itemName = sc.nextLine();

            System.out.print("Enter the price for item " + i + ": ");
            double itemPrice = sc.nextDouble();

            // Create and add the item
            Item item = new Item(itemId, itemName, itemPrice);
            order.addItem(item);
        }

        // Display order details and average cost
        System.out.println("You have created a new order with ID: " + order.getId());
        System.out.println("In the order, you have " + order.numberOfItems() + " items.");
        System.out.printf("The average price in the order is: %.2f%n", order.calculateAverageCost());
    }
}