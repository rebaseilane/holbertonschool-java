public class Order {
    private double discountPercentage;
    private ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items) {
        this.discountPercentage = discountPercentage;
        this.items = items;
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

            System.out.printf("Type: %s  Title: %s  Price: %.2f  Quant: %d  Total: %.2f\n",
                    type, title, price, quantity, total);
        }

        System.out.println("----------------------------");

        double totalProducts = calculateTotalProducts();
        double discount = calculateDiscount();
        double totalOrder = calculateTotal();

        System.out.printf("DISCOUNT: %.2f\n", discount);
        System.out.printf("TOTAL PRODUCTS: %.2f\n", totalProducts);
        System.out.println("----------------------------");
        System.out.printf("TOTAL ORDER: %.2f\n", totalOrder);
        System.out.println("----------------------------");
    }
}
