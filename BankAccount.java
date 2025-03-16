class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
/*
SavingsAccount savings = new SavingsAccount("SA123", 5000, 2.5);
CheckingAccount checking = new CheckingAccount("CA456", 3000, 1000);
FixedDepositAccount fixed = new FixedDepositAccount("FD789", 10000);

savings.displayDetails();
savings.displayAccountType();
checking.displayDetails();
checking.displayAccountType();
fixed.displayDetails();
fixed.displayAccountType();

Account Number: SA123
Balance: 5000.0
This is a Savings Account.
Account Number: CA456
Balance: 3000.0
This is a Checking Account.
Account Number: FD789
Balance: 10000.0
This is a Fixed Deposit Account.
 */