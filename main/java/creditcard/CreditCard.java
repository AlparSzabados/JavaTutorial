package introtocs.main.java.creditcard;

public class CreditCard {
    private int creditLimit = 500;
    private int balance;
    private String cardholder;
    private int purchases;

    //TODO learn how to chain the two constructors

    public CreditCard() {

    }

    public CreditCard(String name) {
        this();
        cardholder = name;
    }

    public CreditCard(String name, int amount) {
        this();
        cardholder = name;
        creditLimit = amount;

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
