import java.util.*;
import java.util.stream.Collectors;

public class PeopleQuery {

    public static Map<String, TreeSet<String>> getHobbiesByPosition(List<Person> people) {

        Comparator<String> hobbyComparator = (h1, h2) -> {
            if (h1.startsWith("watching") && h2.startsWith("watching")) {
                List<String> order = List.of("watching series", "watching soccer", "watching movies");
                return Integer.compare(order.indexOf(h1), order.indexOf(h2));
            }
            return h1.compareTo(h2);
        };

        return people.stream()
                .collect(Collectors.groupingBy(
                        Person::getPosition,
                        () -> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.flatMapping(
                                p -> p.getHobbies().stream(),
                                Collectors.toCollection(() -> new TreeSet<>(hobbyComparator))
                        )
                ));
    }
}
