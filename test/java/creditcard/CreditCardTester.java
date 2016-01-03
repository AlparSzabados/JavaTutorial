package introtocs.test.java.creditcard;

import introtocs.main.java.creditcard.CreditCard;

import java.util.ArrayList;

public class CreditCardTester {
    public static void main(String[] args) {
        ArrayList<CreditCard> cards = new ArrayList<CreditCard>();

        CreditCard card1 = new CreditCard("John Doe", 2500);
        CreditCard card2 = new CreditCard("Szabados Istvan", 1400);
        CreditCard card3 = new CreditCard("Horvath Alpar", 750);

        card1.makePurchase(1000);
        card1.makePurchase(1500);

        card2.makePurchase(200);
        card2.makePurchase(400);
        card2.makePurchase(150);

        card3.makePurchase(900);

        card1.makePayment(50);
        card2.makePayment(25);
        card3.makePayment(75);

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        for (CreditCard card : cards){
            System.out.println("The cardholder is: " + card.getCardholder());
            System.out.println("Total credit limit: " + card.getCreditLimit());
            System.out.println("Total balance: " + card.getBalance());
            System.out.println("Total reward points: " + card.calculateRewardPoints());
            System.out.println("------------------------------");
        }
    }
}