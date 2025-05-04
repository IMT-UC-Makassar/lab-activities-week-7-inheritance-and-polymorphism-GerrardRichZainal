package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {
    private String loanStatus = "None";

    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
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
        double interest = balance * 0.03; // 3% interest
        balance += interest;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for: " + amount);
        loanStatus = "Pending";
    }

    @Override
    public String checkLoanStatus() {
        return loanStatus;
    }
}
