package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
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
        // Checking accounts have no interest
    }
}
