import java.util.List;

/**
 * Sugar beverage decorator.
 */
public class SugarBeverage extends BeverageDecorator {
    /**
     * Constructor.
     *
     * @param beverage beverage to decorate
     */
    public SugarBeverage(Beverage beverage) {
        super(beverage);
    }

    /**
     * Returns beverage ingredients with sugar.
     *
     * @return ingredient list
     */
    @Override
    public List<String> getIngredients() {
        List<String> ingredients =
            decoratedBeverage.getIngredients();

        ingredients.add("sugar");

        return ingredients;
    }

    /**
     * Returns beverage price with sugar.
     *
     * @return beverage price
     */
    @Override
    public double getPrice() {
        return decoratedBeverage.getPrice() + 1.9;
    }
}
