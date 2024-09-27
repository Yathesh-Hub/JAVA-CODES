class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient funds. Available balance: " + balance);
            }
        } else {
            System.out.println("Withdraw amount must be positive.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class banktest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        
        double balance = account.getBalance();
        System.out.println("Initial Balance: " + balance);
    }
}
