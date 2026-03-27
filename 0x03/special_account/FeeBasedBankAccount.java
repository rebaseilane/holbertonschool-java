import exceptions.InvalidOperationException;

public class FeeBasedBankAccount extends BasicBankAccount {
    private int transactionCount;

    public FeeBasedBankAccount(String acc, double rate) {
        super(acc, rate);
        transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public void deposit(double value) throws InvalidOperationException {
        super.deposit(value);
        transactionCount++;
        super.withdraw(0.10);
    }

    @Override
    public void withdraw(double value) throws InvalidOperationException {
        super.withdraw(value);
        transactionCount++;
        super.withdraw(0.10);
    }
}
