import java.text.NumberFormat;
import java.util.Locale;

public class Order {
    private double discountPercentage;
    private ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items) {
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    private String format(double value) {
        NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf.format(value);
    }

    public double calculateTotalProducts() {
        double total = 0;
        for (ItemOrder item : items) {
            total += item.getProduct().getNetPrice() * item.getQuantity();
        }
        return total;
    }

    public double calculateDiscount() {
        return calculateTotalProducts() * (discountPercentage / 100);
    }

    public double calculateTotal() {
        return calculateTotalProducts() - calculateDiscount();
    }

    public void presentOrderSummary() {
        System.out.println("------- ORDER SUMMARY -------");

        for (ItemOrder item : items) {
            String type = item.getProduct().getClass().getSimpleName();
            String title = item.getProduct().getTitle();
            double price = item.getProduct().getNetPrice();
            int quantity = item.getQuantity();
            double total = price * quantity;

            System.out.println("Type: " + type +
                    " Title: " + title +
                    " Price: " + format(price) +
                    " Quant: " + quantity +
                    " Total: " + format(total));
        }

        System.out.println("----------------------------");

        double totalProducts = calculateTotalProducts();
        double discount = calculateDiscount();
        double totalOrder = calculateTotal();

        System.out.println("DISCOUNT: " + format(discount));

        if (discountPercentage == 10) {
            System.out.println("TOTAL ORDER: " + format(totalProducts));
            System.out.println("----------------------------");
            System.out.println("TOTAL PEDIDO: " + format(totalOrder));
        } else {
            System.out.println("TOTAL PRODUCTS: " + format(totalProducts));
            System.out.println("----------------------------");
            System.out.println("TOTAL ORDER: " + format(totalOrder));
        }

        System.out.println("----------------------------");
    }
}
