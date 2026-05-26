/**
 * Program entry point.
 */
public class Program {
    /**
     * Main method.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Beverage coffee = new CoffeeBeverage();

        System.out.println(coffee);

        Beverage coffeeWithMilk =
            new MilkBeverage(coffee);

        System.out.println(coffeeWithMilk);

        Beverage coffeeWithSugar =
            new SugarBeverage(coffee);

        System.out.println(coffeeWithSugar);

        Beverage coffeeWithSugarAndMilk =
            new SugarBeverage(coffeeWithMilk);

        System.out.println(coffeeWithSugarAndMilk);
    }
}
