package sakila.scam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PaymentTest {

    Payment paymentTest = new Payment(10.5);
    Payment paymentTest2 = new Payment();

    @Test
    void testGetters(){
        Assertions.assertEquals(10.5, paymentTest.getAmount());
    }

    @Test
    void testGetters2(){
        Assertions.assertEquals(0, paymentTest2.getFilmId());
        Assertions.assertEquals(0, paymentTest2.getAmount());
    }

    @Test
    void testSetters(){
        paymentTest.setAmount(12.5);
        Assertions.assertEquals(12.5, paymentTest.getAmount());
    }

}
