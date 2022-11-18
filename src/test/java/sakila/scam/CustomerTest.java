package sakila.scam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class CustomerTest {

    Customer testCustomer = new Customer("Hugh", "Jazz", "HughJazz@JennaTools.com");
    Customer testCustomer2 = new Customer();

    @Test
    void testGetFirstName(){
        Assertions.assertEquals("Hugh", testCustomer.getFirstName());
    }

    @Test
    void testGetLastName(){
        Assertions.assertEquals("Jazz", testCustomer.getLastName());
    }
    @Test
    void testGetEmail(){
        Assertions.assertEquals("HughJazz@JennaTools.com", testCustomer.getEmail());
    }

    @Test
    void testGetId(){
        Assertions.assertEquals(0, testCustomer2.getCustomerId());
    }
    @Test
    void testSetFirstName(){
        testCustomer.setFirstName("Boo");
        Assertions.assertEquals("Boo",testCustomer.getFirstName());
    }
    @Test
    void testSetId(){
        testCustomer.setCustomerId(1);
        Assertions.assertEquals(1, testCustomer.getCustomerId());
    }
    @Test
    void testSetLastName(){
        testCustomer.setLastName("Khaki");
        Assertions.assertEquals("Khaki", testCustomer.getLastName());
    }
    @Test
    void testSetEmail(){
        testCustomer.setEmail("BooKhaki@FourSkin.com");
        Assertions.assertEquals("BooKhaki@FourSkin.com", testCustomer.getEmail());
    }
}
