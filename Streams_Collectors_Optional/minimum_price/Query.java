import java.util.List;
import java.util.stream.Collectors;

public class Query {
    public static List<Product> getProductsByMinimumPrice(List<Product> products, double minPrice) {
        return products.stream()
                .filter(p -> p.getPrice() >= minPrice)
                .collect(Collectors.toList());
    }
}
