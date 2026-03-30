public class Order {
    private double discountPercentage;
    private ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items) {
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    public double calculateTotal() {
        double total = 0;

        for (ItemOrder item : items) {
            double itemTotal = item.getProduct().getNetPrice() * item.getQuantity();
            total += itemTotal;
        }

        double discount = total * (discountPercentage / 100);
        return total - discount;
    }
}
