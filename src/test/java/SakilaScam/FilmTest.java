package SakilaScam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmTest {

    Film testFilm = new Film("testTitle", "testDes", 1, 50, 1, "testRate");

    @org.junit.Test
    public void testGetters(){
        Assertions.assertEquals("testTitle",testFilm.getTitle());
        Assertions.assertEquals("testDes",testFilm.getDescription());
        Assertions.assertEquals(1,testFilm.getLanguage_id());
        Assertions.assertEquals(50,testFilm.getLength());
        Assertions.assertEquals(1, testFilm.getTitle());
        Assertions.assertEquals("testRate",testFilm.getRating());
    }
    @org.junit.Test
    public void testSetters(){
        testFilm.setFilm_id(203);
        testFilm.setTitle("testTitle1");
        testFilm.setDescription("testDes1");
        testFilm.setLanguage_id(2);
        testFilm.setLength(51);
        testFilm.setRental_rate(2);
        testFilm.setRating("testRate1");

        Assertions.assertEquals("testTitle1",testFilm.getTitle());
        Assertions.assertEquals("testDes1",testFilm.getDescription());
        Assertions.assertEquals(2,testFilm.getLanguage_id());
        Assertions.assertEquals(51,testFilm.getLength());
        Assertions.assertEquals(2, testFilm.getTitle());
        Assertions.assertEquals("testRate1",testFilm.getRating());
    }

}
