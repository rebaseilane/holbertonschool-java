import java.util.UUID;

/**
 * SalaryCalculatorService class.
 * Implements the Singleton design pattern.
 */
public class SalaryCalculatorService {
    /**
     * Singleton instance.
     */
    private static SalaryCalculatorService instance;

    /**
     * Unique identifier for the calculator service.
     */
    public UUID uuid = UUID.randomUUID();

    /**
     * Private constructor to prevent instantiation.
     */
    private SalaryCalculatorService() {
    }

    /**
     * Returns the singleton instance.
     *
     * @return SalaryCalculatorService instance
     */
    public static SalaryCalculatorService getSalaryCalculatorService() {
        if (instance == null) {
            instance = new SalaryCalculatorService();
        }

        return instance;
    }

    /**
     * Calculates the employee net salary.
     *
     * @param grossSalary gross salary
     * @param discountValue discount value
     * @param salesValue sales value
     * @param commissionPercentage commission percentage
     * @return calculated net salary
     */
    public double calculateNetSalary(
        double grossSalary,
        double discountValue,
        double salesValue,
        double commissionPercentage
    ) {
        return grossSalary - discountValue
            + (salesValue * (commissionPercentage / 100));
    }
}
