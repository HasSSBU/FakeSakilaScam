package SakilaScam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmTest {

    Film testFilm = new Film("testTitle", "testDes", 1, 50, 1, "testRate");

    @org.junit.Test
    public void testGetters(){
        Assertions.assertEquals(testFilm.getTitle(),"testTitle");
        Assertions.assertEquals(testFilm.getDescription(),"testDes");
        Assertions.assertEquals(testFilm.getLanguage_id(),1);
        Assertions.assertEquals(testFilm.getLength(),50);
        Assertions.assertEquals(testFilm.getTitle(),1);
        Assertions.assertEquals(testFilm.getRating(),"testRate");
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

        Assertions.assertEquals(testFilm.getTitle(),"testTitle1");
        Assertions.assertEquals(testFilm.getDescription(),"testDes1");
        Assertions.assertEquals(testFilm.getLanguage_id(),2);
        Assertions.assertEquals(testFilm.getLength(),51);
        Assertions.assertEquals(testFilm.getRental_rate(),2);
        Assertions.assertEquals(testFilm.getRating(),"testRate1");
    }

}
