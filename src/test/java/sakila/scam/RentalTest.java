package sakila.scam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RentalTest {

    Rental rentalTest = new Rental("test1", "test2");
    Rental rentalTest2 = new Rental();

    @Test
    void TestGetRentalDate(){
        Assertions.assertEquals("test1", rentalTest.getRentalDate());
    }
    @Test
    void TestGetReturnDate(){
        Assertions.assertEquals("test2", rentalTest.getReturnDate());
    }

    @Test
    void TestSetRentalDate(){
        rentalTest.setRentalDate("24/07/1998");
        Assertions.assertEquals("24/07/1998", rentalTest.getRentalDate());
    }
    @Test
    void TestSetId(){
        rentalTest.setRentalId(1);
        Assertions.assertEquals(1, rentalTest.getRentalId());
    }
    @Test
    void TestSetReturnDate(){
        rentalTest.setReturnDate("27/06/2000");
        Assertions.assertEquals("27/06/2000", rentalTest.getReturnDate());
    }
}

