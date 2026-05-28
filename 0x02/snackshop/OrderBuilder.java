/**
 * Builder class for creating orders.
 */
public class OrderBuilder extends OrderAbstractBuilder
{
    private Order order;

    /**
     * Constructor for OrderBuilder.
     */
    public OrderBuilder()
    {
        this.order = new Order();
    }

    /**
     * Add snack to order.
     *
     * @param type snack type
     */
    @Override
    public void setSnack(SnackType type)
    {
        this.order.addItemInBox(
            new OrderItem(OrderItemType.SNACK, type.toString())
        );
    }

    /**
     * Add fries to order.
     *
     * @param size fries size
     */
    @Override
    public void setFries(FriesSize size)
    {
        this.order.addItemInBox(
            new OrderItem(OrderItemType.FRIES, size.toString())
        );
    }

    /**
     * Add toy to order.
     *
     * @param type toy type
     */
    @Override
    public void setToy(ToyType type)
    {
        this.order.addItemInBox(
            new OrderItem(OrderItemType.TOY, type.toString())
        );
    }

    /**
     * Add drink to order.
     *
     * @param type drink type
     */
    @Override
    public void setDrink(DrinkType type)
    {
        this.order.addItemOutOfBox(
            new OrderItem(OrderItemType.DRINK, type.toString())
        );
    }

    /**
     * Build and return order.
     *
     * @return completed order
     */
    public Order build()
    {
        return this.order;
    }
}
