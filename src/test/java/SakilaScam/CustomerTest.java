package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CustomerTest {

    Customer testCustomer = new Customer("Hugh", "Jazz", "HughJazz@JennaTools.com");
    Customer testCustomer2 = new Customer();

    @Test
    public void testGetters(){
        Assertions.assertEquals("Hugh", testCustomer.getFirstName());
        Assertions.assertEquals("Jazz", testCustomer.getLastName());
        Assertions.assertEquals("HughJazz@JennaTools.com", testCustomer.getEmail());
    }

    @Test
    public  void testGetters2(){
        Assertions.assertEquals(0, testCustomer2.getCustomerId());
        Assertions.assertNull(testCustomer2.getFirstName());
        Assertions.assertNull(testCustomer2.getLastName());
        Assertions.assertNull(testCustomer2.getEmail());
    }

    @Test
    public void testSetters(){
        testCustomer.setCustomerId(1);
        testCustomer.setFirstName("Boo");
        testCustomer.setLastName("Khaki");
        testCustomer.setEmail("BooKhaki@FourSkin.com");

        Assertions.assertEquals(1, testCustomer.getCustomerId());
        Assertions.assertEquals("Boo",testCustomer.getFirstName());
        Assertions.assertEquals("Khaki", testCustomer.getLastName());
        Assertions.assertEquals("BooKhaki@FourSkin.com", testCustomer.getEmail());


    }
}
