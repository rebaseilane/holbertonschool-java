import java.util.*;
import java.util.stream.Collectors;

public class PeopleQuery {

    public static Map<String, Long> getPeopleCountByPosition(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        Person::getPosition,
                        () -> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.counting()
                ));
    }
}
