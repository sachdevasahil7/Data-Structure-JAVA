package OOPS.Encapsulation;


import java.lang.reflect.Field;

class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    public void displayBalance() {
        System.out.println("Savings Account Balance: $" + getBalance());
    }
}

// Test class
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        BankAccount account = new BankAccount(1000);

        Class<?> bankAccountClass = account.getClass();

        Field balanceField = bankAccountClass.getDeclaredField("balance");

        balanceField.setAccessible(true);

        double balanceValue = (double) balanceField.get(account);
        System.out.println("Initial Balance (using reflection): " + balanceValue);

        balanceField.set(account, 5000.0);

        // Get the updated balance
        double updatedBalance = (double) balanceField.get(account);
        System.out.println("Updated Balance (using reflection): " + updatedBalance);





    }
}
