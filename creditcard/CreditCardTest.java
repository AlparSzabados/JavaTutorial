package introtocs.creditcard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import javax.swing.*;


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
    }

    @Test
    public void testMakePurchaseWithFee() {
        card1.makePurchase(700);
        assertEquals(750, card1.getBalance());
    }

    @Test
    public void testMakePayment() {
        card2.makePurchase(900);
        card2.makePayment(1000);
        assertEquals(-100, card2.getBalance());
    }

    @Test
    public void testCalculateRewardPoints() {
        card2.makePurchase(900);
        card2.makePurchase(10);
        card2.makePurchase(10);
        card2.makePurchase(10);
        card2.makePurchase(10);
        assertEquals(500, card2.calculateRewardPoints());
    }
}
