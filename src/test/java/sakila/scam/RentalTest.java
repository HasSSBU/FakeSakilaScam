package sakila.scam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RentalTest {

    Rental rentalTest = new Rental("test1", "test2");
    Rental rentalTest2 = new Rental();

    @Test
    void TestGetters(){
        Assertions.assertEquals("test1", rentalTest.getRentalDate());
        Assertions.assertEquals("test2", rentalTest.getReturnDate());
    }
    @Test
    void TestGetters2(){
        Assertions.assertEquals(0, rentalTest2.getRentalId());
        Assertions.assertNull(rentalTest2.getRentalDate());
        Assertions.assertNull(rentalTest2.getReturnDate());
    }
    @Test
    void TestSetters(){
        rentalTest.setRentalDate("24/07/1998");
        rentalTest.setRentalId(1);
        rentalTest.setReturnDate("27/06/2000");
        Assertions.assertEquals(1, rentalTest.getRentalId());
        Assertions.assertEquals("24/07/1998", rentalTest.getRentalDate());
        Assertions.assertEquals("27/06/2000", rentalTest.getReturnDate());
    }
}
