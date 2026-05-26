import java.util.List;

/**
 * Milk beverage decorator.
 */
public class MilkBeverage extends BeverageDecorator {
    /**
     * Constructor.
     *
     * @param beverage beverage to decorate
     */
    public MilkBeverage(Beverage beverage) {
        super(beverage);
    }

    /**
     * Returns beverage ingredients with milk.
     *
     * @return ingredient list
     */
    @Override
    public List<String> getIngredients() {
        List<String> ingredients =
            decoratedBeverage.getIngredients();

        ingredients.add("milk");

        return ingredients;
    }

    /**
     * Returns beverage price with milk.
     *
     * @return beverage price
     */
    @Override
    public double getPrice() {
        return decoratedBeverage.getPrice() + 3.2;
    }
}
