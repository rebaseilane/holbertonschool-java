public class ControlledBankAccount extends BasicBankAccount {
    private double minimumBalance;
    private double penaltyAmount;

    public ControlledBankAccount(String acc, double rate, double min, double penalty) {
        super(acc, rate);
        this.minimumBalance = min;
        this.penaltyAmount = penalty;
    }

    @Override
    public void applyMonthlyUpdate() {
        super.applyMonthlyUpdate();
        if (getBalance() < minimumBalance) {
            try {
                withdraw(penaltyAmount);
            } catch (Exception e) {
                // ignore
            }
        }
    }
}
