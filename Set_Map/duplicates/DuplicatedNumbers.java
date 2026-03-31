import java.util.HashSet;
import java.util.TreeSet;

public class DuplicatedNumbers {

    public static TreeSet<Integer> isFind(int[] numbers) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return new TreeSet<>(duplicates);
    }
}
