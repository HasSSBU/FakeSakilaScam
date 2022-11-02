package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentTest {

    Payment paymentTest = new Payment(10.5);
    Payment paymentTest2 = new Payment();

    @Test
    public void testGetters(){
        Assertions.assertEquals(10.5, paymentTest.getAmount());
    }

    @Test
    public void testGetters2(){
        Assertions.assertEquals(0, paymentTest2.getFilm_id());
        Assertions.assertEquals(0, paymentTest2.getAmount());
    }

    @Test
    public void testSetters(){
        paymentTest.setAmount(12.5);
        Assertions.assertEquals(12.5, paymentTest.getAmount());
    }

}
