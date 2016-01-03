package introtocs.introtocs.groovy.creditcard

class CreditCard {
    int creditLimit
    int balance
    String cardholder
    int purchases

    /**
     * Constructs a credit card with a predetermined credit limit and
     * the provided cardholder's name.
     *
     * @param name the cardholder's name
     */
    public CreditCard(String name) {
        creditLimit = 500
        cardholder = name
        balance = 0
        purchases = 0
    }

    /**
     * Constructs a credit card with the provided name and credit limit.
     *
     * @param name   the cardholder's name
     * @param amount the amount of the credit limit
     */
    public CreditCard(String name, int amount) {
        creditLimit = amount
        cardholder = name
        balance = 0
        purchases = 0
    }

    /**
     * Gets the credit limit of the credit card.
     *
     * @return returns the credit limit
     */
    public getCreditLimit() { creditLimit }

    /**
     * Gets the balance of the credit card.
     *
     * @return returns the balance
     */
    public getBalance() { balance }

    /**
     * Gets the cardholder's name.
     *
     * @return returns the name of the cardholder
     */
    public getCardholder() { cardholder }

    /**
     * Makes a purchase increasing the balance of the credit card.
     *
     * @param amount the amount of the purchase
     */
    public void makePurchase(int amount) {
        def availableCredit = creditLimit - balance
        if (amount > availableCredit) {
            balance = balance + amount + 50
        } else {
            balance = balance + amount
            purchases += 1
        }
    }

    /**
     * Makes a payment to the credit card decreasing the balance.
     *
     * @param amount the amount of payment
     */
    public void makePayment(int amount) {
        balance = balance - amount
    }

    /**
     * Calculates the amount of reward points earned.
     *
     * @return the number of reward points
     */
    public calculateRewardPoints() {
        def points = 0
        for (point in purchases) {
            points += 100
        }
        points
    }
}

