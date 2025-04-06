import java.util.Scanner;
import java.text.NumberFormat;

public class LineItemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product1 = new Product("java", "Murach's Beginning Java", 49.50);

        System.out.println("Welcome to the Line Item Calculator");

        String code = Validator.getString(sc, "Enter product code: ");
        int quantity = Validator.getInt(sc, "Enter quantity: ");

        if (code.equalsIgnoreCase(product1.getCode())) {
            LineItem item = new LineItem();
            item.setProduct(product1);
            item.setQuantity(quantity);

            System.out.println("\nLINE ITEM");
            System.out.println("Code: " + item.getProduct().getCode());
            System.out.println("Description: " + item.getProduct().getDescription());
            System.out.println("Price: " + item.getProduct().getFormattedPrice());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("Total: " + item.getFormattedTotal());
        }

        sc.close();
    }
}
