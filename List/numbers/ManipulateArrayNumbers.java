import java.util.List;

public class ManipulateArrayNumbers {

    public static int findNumberPosition(List<Integer> numbers, int number) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == number) {
                return i;
            }
        }
        return -1;
    }

    public static void addNumber(List<Integer> numbers, int number) {
        if (findNumberPosition(numbers, number) != -1) {
            throw new IllegalArgumentException("Number already in the list");
        }
        numbers.add(number);
    }

    public static void removeNumber(List<Integer> numbers, int number) {
        int position = findNumberPosition(numbers, number);
        if (position == -1) {
            throw new IllegalArgumentException("Number not found in the list");
        }
        numbers.remove(position);
    }

    public static void replaceNumber(List<Integer> numbers, int numberToReplace, int replacementNumber) {
        int position = findNumberPosition(numbers, numberToReplace);
        if (position == -1) {
            numbers.add(replacementNumber);
        } else {
            numbers.set(position, replacementNumber);
        }
    }
}
