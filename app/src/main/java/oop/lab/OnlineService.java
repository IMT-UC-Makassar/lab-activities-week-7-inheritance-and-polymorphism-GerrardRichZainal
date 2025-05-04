package oop.lab;

public interface OnlineService {
    void transfer(String targetAccountNumber, double amount);
    void payBill(String biller, double amount);
}
