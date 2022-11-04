package sakila.scam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PaymentModelTest {

    PaymentModel testPayment = new PaymentModel(20.99);

    @Test
    void testGetters() {
        Assertions.assertEquals(20.99 ,testPayment.getAmount());
    }
}
