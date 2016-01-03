package introtocs.main.java.creditcard;

public class CreditCard {
    private int creditLimit;
    private int balance;
    private String cardholder;
    private int purchases;

    //TODO chain the two constructors

    public CreditCard(String name) {
        creditLimit = 500;
        balance = 0;
        cardholder = name;
        purchases = 0;
    }

    public CreditCard(String name, int amount) {
        creditLimit = amount;
        balance = 0;
        cardholder = name;
        purchases = 0;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getBalance() {
        return balance;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void makePurchase(int amount) {
        int availableCredit = creditLimit - balance;
        if (amount > availableCredit) {
            balance = balance + amount + 50;
        } else {
            balance = balance + amount;
            purchases++;
        }
    }

    public void makePayment(int amount) {
        balance = balance - amount;
    }

    public int calculateRewardPoints() {
        return purchases * 100;
    }
}
