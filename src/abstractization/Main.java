package abstractization;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 500.0, 200.0);

        savingsAccount.displayAccountType();
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());

        checkingAccount.displayAccountType();
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());

        savingsAccount.applyInterest();
        savingsAccount.withdraw(200);

        checkingAccount.deposit(100);
        checkingAccount.withdraw(700);
    }
}
