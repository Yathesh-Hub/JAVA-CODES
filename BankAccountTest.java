abstract class BankAccount {
    protected double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 1000.00;
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Savings Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= MIN_BALANCE) {
                balance -= amount;
                System.out.println("Withdrew " + amount + " from Savings Account.");
            } else {
                System.out.println("Insufficient balance. Minimum balance requirement: " + MIN_BALANCE);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 500.00;
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Current Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= -OVERDRAFT_LIMIT) {
                balance -= amount;
                System.out.println("Withdrew " + amount + " from Current Account.");
            } else {
                System.out.println("Overdraft limit exceeded. Maximum allowable overdraft: " + OVERDRAFT_LIMIT);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(2000.00);
        savings.deposit(500.00);
        savings.withdraw(1000.00);
        System.out.println("Savings Account Balance: " + savings.getBalance());
    }
}
