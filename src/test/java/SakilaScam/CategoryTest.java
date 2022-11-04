package SakilaScam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    Category categoryTest = new Category("Action");
    Category categoryTest2 = new Category();

    @Test
    public void testGetters(){
        Assertions.assertEquals("Action", categoryTest.getName());
    }

    @Test
    public void testGetters2(){
        Assertions.assertNull(categoryTest2.getName());
        Assertions.assertEquals(0, categoryTest2.getCategoryId());
    }

    @Test
    public void testSetters(){
        categoryTest.setName("Hehe");
        categoryTest.setCategoryId(1);

        Assertions.assertEquals("Hehe", categoryTest.getName());
        Assertions.assertEquals(1, categoryTest.getCategoryId());
    }
}
