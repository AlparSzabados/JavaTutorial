package introtocs.test.groovy.creditcard

import introtocs.main.groovy.creditcard.CreditCard

def cards = new ArrayList<CreditCard>()

CreditCard card1 = new CreditCard("Kóter Péter", 2500)
CreditCard card2 = new CreditCard("Szabados István", 1400)
CreditCard card3 = new CreditCard("Horvath Alpár", 750)

card1.makePurchase(1000)
card1.makePurchase(1500)

card2.makePurchase(200)
card2.makePurchase(400)
card2.makePurchase(150)

card3.makePurchase(900)

card1.makePayment(50)
card2.makePayment(25)
card3.makePayment(75)

cards.add(card1)
cards.add(card2)
cards.add(card3)

for (card in cards) {
    println "The cardholder is: " + card.getCardholder()
    println "Total credit limit: " + card.getCreditLimit()
    println "Total balance: " + card.getBalance()
    println "Total reward points: " + card.calculateRewardPoints()
    println "------------------------------"
}

