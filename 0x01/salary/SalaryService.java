/**
 * SalaryService class.
 * Uses SalaryCalculatorService singleton.
 */
public class SalaryService {
    /**
     * Calculator service instance.
     */
    private SalaryCalculatorService calculator =
        SalaryCalculatorService.getSalaryCalculatorService();

    /**
     * Calculates employee salary.
     *
     * @param grossSalary gross salary
     * @param discountValue discount value
     * @param salesValue sales value
     * @param commissionPercentage commission percentage
     * @return calculated salary
     */
    public double calculate(
        double grossSalary,
        double discountValue,
        double salesValue,
        double commissionPercentage
    ) {
        return calculator.calculateNetSalary(
            grossSalary,
            discountValue,
            salesValue,
            commissionPercentage
        );
    }

    /**
     * Returns calculator UUID.
     *
     * @return UUID as string
     */
    public String getUuid() {
        return calculator.uuid.toString();
    }
}
