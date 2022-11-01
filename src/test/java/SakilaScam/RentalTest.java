package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RentalTest {

    Rental rentalTest = new Rental(1,1,1,1,"Yesterday","today");
    Rental rentalTest2 = new Rental();

    @Test
    public void testGetters(){
        Assertions.assertEquals(1,rentalTest.getInventory_id());
        Assertions.assertEquals(1,rentalTest.getCustomer_id());
        Assertions.assertEquals(1,rentalTest.getStaff_id());
        Assertions.assertEquals(1,rentalTest.getRental_id());
        Assertions.assertEquals("Yesterday",rentalTest.getRental_date());
        Assertions.assertEquals("today",rentalTest.getPayment_date());
    }

    @Test
    public void testSetters(){
        rentalTest2.setInventory_id(1);
        rentalTest2.setCustomer_id(1);
        rentalTest2.setStaff_id(1);
        rentalTest2.setRental_id(1);
        rentalTest2.setRental_date("Yesterday");
        rentalTest2.setPayment_date("today");

        Assertions.assertEquals(1,rentalTest.getInventory_id());
        Assertions.assertEquals(1,rentalTest.getCustomer_id());
        Assertions.assertEquals(1,rentalTest.getStaff_id());
        Assertions.assertEquals(1,rentalTest.getRental_id());
        Assertions.assertEquals("Yesterday",rentalTest.getRental_date());
        Assertions.assertEquals("today",rentalTest.getPayment_date());
    }
}
