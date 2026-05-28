import java.util.HashSet;

/**
 * Class representing an order.
 */
public class Order
{
    private HashSet<OrderItem> itemsInBox;
    private HashSet<OrderItem> itemsOutOfBox;

    /**
     * Constructor for Order.
     */
    public Order()
    {
        this.itemsInBox = new HashSet<OrderItem>();
        this.itemsOutOfBox = new HashSet<OrderItem>();
    }

    /**
     * Add item inside the box.
     *
     * @param item order item
     */
    public void addItemInBox(OrderItem item)
    {
        this.itemsInBox.add(item);
    }

    /**
     * Add item outside the box.
     *
     * @param item order item
     */
    public void addItemOutOfBox(OrderItem item)
    {
        this.itemsOutOfBox.add(item);
    }

    /**
     * String representation of Order.
     *
     * @return formatted order string
     */
    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();

        result.append("\tOut of the Box:\n");

        for (OrderItem item : this.itemsOutOfBox)
        {
            result.append("\t\t").append(item).append("\n");
        }

        result.append("\tIn the Box:\n");

        for (OrderItem item : this.itemsInBox)
        {
            result.append("\t\t").append(item).append("\n");
        }

        return result.toString();
    }
}
