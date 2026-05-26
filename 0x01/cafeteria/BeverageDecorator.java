import java.util.List;

/**
 * Beverage decorator class.
 */
public class BeverageDecorator extends Beverage {
    /**
     * Decorated beverage.
     */
    protected Beverage decoratedBeverage;

    /**
     * Constructor.
     *
     * @param beverage beverage to decorate
     */
    public BeverageDecorator(Beverage beverage) {
        this.decoratedBeverage = beverage;
    }

    /**
     * Returns decorated beverage ingredients.
     *
     * @return ingredient list
     */
    @Override
    public List<String> getIngredients() {
        return decoratedBeverage.getIngredients();
    }

    /**
     * Returns decorated beverage price.
     *
     * @return beverage price
     */
    @Override
    public double getPrice() {
        return decoratedBeverage.getPrice();
    }
}
