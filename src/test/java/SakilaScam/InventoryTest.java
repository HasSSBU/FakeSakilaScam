package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InventoryTest {

    public Inventory testInventory = new Inventory();

    @Test
    public void TestAll(){
        testInventory.setInventory_id(1);
        Assertions.assertEquals(1, testInventory.getInventory_id());

    }
}
