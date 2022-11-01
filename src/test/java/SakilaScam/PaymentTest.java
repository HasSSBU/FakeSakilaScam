package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentTest {

    Payment paymentTest = new Payment(1,1,1,1,0.99,"today");
    Payment paymentTest2 = new Payment();

    @Test
    public void testGetters(){
        Assertions.assertEquals(1,paymentTest.getPayment_id());
        Assertions.assertEquals(1,paymentTest.getCustomer_id());
        Assertions.assertEquals(1,paymentTest.getStaff_id());
        Assertions.assertEquals(1,paymentTest.getRental_id());
        Assertions.assertEquals(0.99,paymentTest.getAmount());
        Assertions.assertEquals("today",paymentTest.getPayment_date());
    }

    @Test
    public void testSetters(){
        paymentTest2.setPayment_id(1);
        paymentTest2.setCustomer_id(1);
        paymentTest2.setStaff_id(1);
        paymentTest2.setRental_id(1);
        paymentTest2.setAmount(0.99);
        paymentTest2.setPayment_date("today");

        Assertions.assertEquals(1,paymentTest.getPayment_id());
        Assertions.assertEquals(1,paymentTest.getCustomer_id());
        Assertions.assertEquals(1,paymentTest.getStaff_id());
        Assertions.assertEquals(1,paymentTest.getRental_id());
        Assertions.assertEquals(0.99,paymentTest.getAmount());
        Assertions.assertEquals("today",paymentTest.getPayment_date());
    }
}
