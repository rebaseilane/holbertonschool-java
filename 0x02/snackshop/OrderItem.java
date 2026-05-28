/**
 * Class representing an order item.
 */
public class OrderItem
{
    private OrderItemType type;
    private String name;

    /**
     * Constructor for OrderItem.
     *
     * @param type item type
     * @param name item name
     */
    public OrderItem(OrderItemType type, String name)
    {
        this.type = type;
        this.name = name;
    }

    /**
     * Getter for item type.
     *
     * @return item type
     */
    public OrderItemType getType()
    {
        return this.type;
    }

    /**
     * Getter for item name.
     *
     * @return item name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * String representation of OrderItem.
     *
     * @return formatted string
     */
    @Override
    public String toString()
    {
        return "- " + this.type + " " + this.name;
    }
}
