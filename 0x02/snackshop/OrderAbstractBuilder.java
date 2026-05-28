/**
 * Abstract builder class for orders.
 */
public abstract class OrderAbstractBuilder
{
    /**
     * Set snack item.
     *
     * @param type snack type
     */
    public abstract void setSnack(SnackType type);

    /**
     * Set fries item.
     *
     * @param size fries size
     */
    public abstract void setFries(FriesSize size);

    /**
     * Set toy item.
     *
     * @param type toy type
     */
    public abstract void setToy(ToyType type);

    /**
     * Set drink item.
     *
     * @param type drink type
     */
    public abstract void setDrink(DrinkType type);
}
