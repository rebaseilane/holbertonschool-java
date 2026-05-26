import java.util.List;

/**
 * Abstract Beverage class.
 */
public abstract class Beverage {
    /**
     * Returns beverage ingredients.
     *
     * @return ingredient list
     */
    public abstract List<String> getIngredients();

    /**
     * Returns beverage price.
     *
     * @return beverage price
     */
    public abstract double getPrice();

    /**
     * Returns formatted beverage string.
     *
     * @return formatted string
     */
    @Override
    public String toString() {
        return String.format(
            "Price: %.2f - Ingredients: %s",
            getPrice(),
            getIngredients()
        );
    }
}
