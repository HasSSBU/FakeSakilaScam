package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CustomerTest {

    Customer testCustomer = new Customer("Hugh", "Jazz", "HughJazz@JennaTools.com");
    Customer testCustomer2 = new Customer();

    @Test
    public void testGetters(){
        Assertions.assertEquals("Hugh", testCustomer.getFirst_name());
        Assertions.assertEquals("Jazz", testCustomer.getLast_name());
        Assertions.assertEquals("HughJazz@JennaTools.com", testCustomer.getEmail());
    }

    @Test
    public  void testGetters2(){
        Assertions.assertEquals(0, testCustomer2.getCustomer_id());
        Assertions.assertNull(testCustomer2.getFirst_name());
        Assertions.assertNull(testCustomer2.getLast_name());
        Assertions.assertNull(testCustomer2.getEmail());
    }
}
