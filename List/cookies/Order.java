import java.util.ArrayList;

public class Order {
    private ArrayList<CookieOrder> cookies;

    public Order() {
        cookies = new ArrayList<>();
    }

    public void addCookieOrder(CookieOrder cookieOrder) {
        cookies.add(cookieOrder);
    }

    public int getTotalBoxes() {
        int total = 0;
        for (CookieOrder order : cookies) {
            total += order.getBoxQuantity();
        }
        return total;
    }

    public int removeFlavor(String flavor) {
        int removed = 0;

        for (int i = 0; i < cookies.size(); i++) {
            if (cookies.get(i).getFlavor().equals(flavor)) {
                removed += cookies.get(i).getBoxQuantity();
                cookies.remove(i);
                i--;
            }
        }

        return removed;
    }
}
