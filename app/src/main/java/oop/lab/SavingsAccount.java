package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void transfer(String targetAccountNumber, double amount) {
        transferFunds(amount, targetAccountNumber);
    }

    @Override
    public void payBill(String biller, double amount) {
        payBills(amount);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.02; // 2% interest
        balance += interest;
    }
}
