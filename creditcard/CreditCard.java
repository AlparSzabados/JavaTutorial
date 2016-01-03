package introtocs.creditcard;

public class CreditCard {
    private int creditLimit;
    private int balance;
    private String cardholder;
    private int purchases;

    /**
     * Constructs a credit card with a predetermined credit limit and
     * the provided cardholder's name.
     *
     * @param name the cardholder's name
     */
    public CreditCard(String name) {
        creditLimit = 500;
        balance = 0;
        cardholder = name;
        purchases = 0;

    }

    /**
     * Constructs a credit card with the provided name and credit limit.
     *
     * @param name   the cardholder's name
     * @param amount the amount of the credit limit
     */
    public CreditCard(String name, int amount) {
        creditLimit = amount;
        balance = 0;
        cardholder = name;
        purchases = 0;

    }

    /**
     * Gets the credit limit of the credit card.
     *
     * @return returns the credit limit
     */
    public int getCreditLimit() {
        return creditLimit;
    }

    /**
     * Gets the balance of the credit card.
     *
     * @return returns the balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Gets the cardholder's name.
     *
     * @return returns the name of the cardholder
     */
    public String getCardholder() {
        return cardholder;
    }

    /**
     * Makes a purchase increasing the balance of the credit card.
     *
     * @param amount the amount of the purchase
     */
    public void makePurchase(int amount) {
        int availableCredit = creditLimit - balance;
        if (amount > availableCredit) {
            balance = balance + amount + 50;
        } else {
            balance = balance + amount;
            purchases++;
        }
    }

    /**
     * Makes a payment to the credit card decreasing the balance.
     *
     * @param amount the amount of payment
     */
    public void makePayment(int amount) {
        balance = balance - amount;
    }

    /**
     * Calculates the amount of reward points earned.
     *
     * @return the number of reward points
     */
    public int calculateRewardPoints() {
        int points = 0;

        for (int i = 0; i < purchases; i++) {
            points = points + 100;
        }

        return points;
    }
}
