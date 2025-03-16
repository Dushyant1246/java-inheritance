class FixedDepositAccount extends BankAccount {

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }
}