
import java.util.ArrayList;
import java.util.List;

/**
 * Coffee beverage class.
 */
public class CoffeeBeverage extends Beverage {
    /**
     * Returns coffee ingredients.
     *
     * @return ingredient list
     */
    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>();

        ingredients.add("coffee");

        return ingredients;
    }

    /**
     * Returns coffee price.
     *
     * @return coffee price
     */
    @Override
    public double getPrice() {
        return 5.35;
    }
}
