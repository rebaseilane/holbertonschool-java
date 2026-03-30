public class PositiveInteger {
    private int value;

    // Constructor with int
    public PositiveInteger(int value) {
        setValue(value);
    }

    // Constructor with String
    public PositiveInteger(String value) {
        try {
            int parsedValue = Integer.parseInt(value);
            setValue(parsedValue);
        } catch (Exception e) {
            throw new IllegalArgumentException("Value is not a positive integer");
        }
    }

    // Getter
    public int getValue() {
        return value;
    }

    // Setter (required name)
    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value is not a positive integer");
        }
        this.value = value;
    }

    // IMPORTANT: matches Program.java typo
    public void setValor(int value) {
        setValue(value);
    }

    // Check if prime
    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }
}
