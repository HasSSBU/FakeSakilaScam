package SakilaScam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Film_CategoryTest {

    Film_Category film_categoryTest = new Film_Category();

    @Test
    public void testGetters(){
        Assertions.assertEquals(0,film_categoryTest.getCategory_id());
        Assertions.assertEquals(0,film_categoryTest.getFilm_id());
    }

    @Test
    public void testSetters(){
        film_categoryTest.setCategory_id(1);
        film_categoryTest.setFilm_id(1);

        Assertions.assertEquals(1,film_categoryTest.getCategory_id());
        Assertions.assertEquals(1,film_categoryTest.getFilm_id());
    }
}
