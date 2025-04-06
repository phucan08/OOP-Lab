import java.util.Scanner;
import java.text.NumberFormat;

class LineItem {
    private Product product;
    private int quantity;
    private double total;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        calculateTotal();
    }

    public int getQuantity() {
        return quantity;
    }

    private void calculateTotal() {
        this.total = quantity * product.getPrice();
    }

    public double getTotal() {
        return total;
    }

    public String getFormattedTotal() {
        return NumberFormat.getCurrencyInstance().format(total);
    }
}