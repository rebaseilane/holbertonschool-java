public class Program {
    public static void main(String[] args) {

        Product product1 = new Product(129.99, "Mouse Gamer");

        String price1 = String.format("%.2f", product1.getPrice()).replace('.', ',');
        String markup1 = String.format("%.2f", product1.priceWithMarkup.get()).replace('.', ',');

        System.out.printf("%s - %s - %s\n",
                product1.getName(),
                price1,
                markup1);

        product1.updateMarkup.accept(15d);

        String markup2 = String.format("%.2f", product1.priceWithMarkup.get()).replace('.', ',');

        System.out.printf("%s - %s - %s\n",
                product1.getName(),
                price1,
                markup2);
    }
}
