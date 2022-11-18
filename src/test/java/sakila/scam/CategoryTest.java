package sakila.scam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CategoryTest {

    Category categoryTest = new Category("Action");
    Category categoryTest2 = new Category();

    @Test
    void testGetName(){
        Assertions.assertEquals("Action", categoryTest.getName());
    }

    @Test
    void testGetId(){
        Assertions.assertEquals(0, categoryTest2.getCategoryId());
    }

    @Test
    void testSetName(){
        categoryTest.setName("Hehe");
        Assertions.assertEquals("Hehe", categoryTest.getName());

    }
    @Test
    void testSetId(){
        categoryTest.setCategoryId(1);
        Assertions.assertEquals(1, categoryTest.getCategoryId());
    }
}
