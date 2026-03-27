public class Manager extends Employee {

    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    public double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            double baseBonus = getFixedSalary() * 0.20;
            double extra = (department.getAchievedTargetValue() - department.getTargetValue()) * 0.01;
            return baseBonus + extra;
        }
        return 0;
    }
}
