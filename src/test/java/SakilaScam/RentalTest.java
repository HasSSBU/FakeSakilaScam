package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RentalTest {

    Rental rentalTest = new Rental("test1", "test2");
    Rental rentalTest2 = new Rental();

    @Test
    public void TestGetters(){
        Assertions.assertEquals("test1", rentalTest.getRental_date());
        Assertions.assertEquals("test2", rentalTest.getReturn_date());
    }
    @Test
    public void TestGetters2(){
        Assertions.assertEquals(0, rentalTest2.getRental_id());
        Assertions.assertNull(rentalTest2.getRental_date());
        Assertions.assertNull(rentalTest2.getReturn_date());
    }
    @Test
    public void TestSetters(){
        rentalTest.setRental_date("24/07/1998");
        rentalTest.setRental_id(1);
        rentalTest.setReturn_date("27/06/2000");
        Assertions.assertEquals(1, rentalTest.getRental_id());
        Assertions.assertEquals("24/07/1998", rentalTest.getRental_date());
        Assertions.assertEquals("27/06/2000", rentalTest.getReturn_date());
    }
}
