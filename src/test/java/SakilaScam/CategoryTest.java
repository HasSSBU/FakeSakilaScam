package SakilaScam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {
    Category testCategory = new Category("Fake");
    Category testCategory2 = new Category();

    @Test
    public void testGetters() {
        Assertions.assertEquals("Fake",testCategory.getName());
    }
    @Test
    public void testGetters2() {
        Assertions.assertNull(testCategory2.getName());
    }

    @Test
    public void testSetters(){
        testCategory.setCategory_id(1);
        testCategory.setName("NotFake");
        Assertions.assertEquals(1, testCategory.getCategory_id());
        Assertions.assertEquals("NotFake", testCategory.getName());
    }
}
