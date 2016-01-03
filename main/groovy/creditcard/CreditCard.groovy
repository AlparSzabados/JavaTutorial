package introtocs.main.groovy.creditcard

class CreditCard {
    int creditLimit
    int balance
    String cardholder
    int purchases

    def CreditCard(String name, int amount = 500) {
        creditLimit = amount
        cardholder = name
        balance = 0
        purchases = 0
    }

    def makePurchase(int amount) {
        def availableCredit = creditLimit - balance
        if (amount > availableCredit) {
            balance += amount + 50
        } else {
            balance += amount
            purchases += 1
        }
    }

    def makePayment(int amount) {
        balance -= amount
    }

    def calculateRewardPoints() {
        purchases * 100
    }
}

