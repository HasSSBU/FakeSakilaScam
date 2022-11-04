package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class InventoryTest {

    Inventory testInventory = new Inventory();

    @Test
    void TestAll(){
        testInventory.setInventoryId(1);
        Assertions.assertEquals(1, testInventory.getInventoryId());

    }
}
