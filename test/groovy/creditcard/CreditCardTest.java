package introtocs.test.groovy.creditcard;

import static org.junit.Assert.*;

import introtocs.main.groovy.creditcard.CreditCard;
import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {

    private CreditCard card1;
    private CreditCard card2;

    @Before
    public void setUp() throws Exception {
        card1 = new CreditCard("Kóter Péter");
        card2 = new CreditCard("Szabados Alpár", 1000);
    }

    @Test
    public void testCreditCardString() {
        assertEquals("Kóter Péter", card1.getCardholder());
        assertEquals(500, card1.getCreditLimit());
        assertEquals(0, card1.getBalance());
    }

    @Test
    public void testCreditCardStringInt() {
        assertEquals("Szabados Alpár", card2.getCardholder());
        assertEquals(1000, card2.getCreditLimit());
        assertEquals(0, card2.getBalance());
    }

    @Test
    public void testMakePurchaseNoFee() {
        card1.makePurchase(450);
        assertEquals(450, card1.getBalance());
        card2.makePurchase(600);
        assertEquals(600, card2.getBalance());
    }

    @Test
    public void testMakePurchaseWithFee() {
        card1.makePurchase(700);
        assertEquals(750, card1.getBalance());
        card2.makePurchase(1001);
        assertEquals(1051, card2.getBalance());
    }

    @Test
    public void testMakePayment() {
        card1.makePurchase(499);
        card1.makePayment(500);
        assertEquals(-1, card1.getBalance());
        card2.makePurchase(900);
        card2.makePayment(1000);
        assertEquals(-100, card2.getBalance());
    }

    @Test
    public void testCalculateRewardPoints() {
        card1.makePurchase(1);
        card1.makePurchase(1);
        card1.makePurchase(1);
        assertEquals(300, card1.calculateRewardPoints());
        card2.makePurchase(900);
        card2.makePurchase(10);
        card2.makePurchase(10);
        card2.makePurchase(10);
        card2.makePurchase(10);
        assertEquals(500, card2.calculateRewardPoints());
    }
}

