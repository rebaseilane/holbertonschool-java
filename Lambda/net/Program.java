public class Program {
    public static void main(String[] args) {

        Employee employee1 = new Employee(2360);

        double netSalary90percent = Payroll.calculateNet(employee1, x -> x * 0.9);
        double netSalaryPlus50 = Payroll.calculateNet(employee1, x -> x + 50);
        double netSalaryPlus10percent = Payroll.calculateNet(employee1, x -> x * 1.1);

        String salary = String.format("%.2f", employee1.getSalary()).replace('.', ',');
        String net1 = String.format("%.2f", netSalary90percent).replace('.', ',');
        String net2 = String.format("%.2f", netSalaryPlus50).replace('.', ',');
        String net3 = String.format("%.2f", netSalaryPlus10percent).replace('.', ',');

        System.out.printf("%s - %s\n", salary, net1);
        System.out.printf("%s - %s\n", salary, net2);
        System.out.printf("%s - %s\n", salary, net3);
    }
}
