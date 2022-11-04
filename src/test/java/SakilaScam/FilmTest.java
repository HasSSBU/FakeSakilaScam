package SakilaScam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FilmTest {

    Film testFilm = new Film("testTitle", "testDes", 1, 50, 1, "testRate", 20.0);
    Film testFilm2 = new Film();

    @Test
    void testGetters(){
        Assertions.assertEquals("testTitle",testFilm.getTitle());
        Assertions.assertEquals("testDes",testFilm.getDescription());
        Assertions.assertEquals(1,testFilm.getLanguageId());
        Assertions.assertEquals(50,testFilm.getLength());
        Assertions.assertEquals(1, testFilm.getRentalRate());
        Assertions.assertEquals("testRate",testFilm.getRating());
        Assertions.assertEquals(20.0, testFilm.getReplacementCost());
    }

    @Test
    void testGetters2(){
        Assertions.assertEquals(0, testFilm2.getFilmId());
        Assertions.assertNull(testFilm2.getTitle());
        Assertions.assertNull(testFilm2.getDescription());
        Assertions.assertEquals(0 ,testFilm2.getLanguageId());
        Assertions.assertEquals(0,testFilm2.getLength());
        Assertions.assertEquals(0, testFilm2.getRentalRate());
        Assertions.assertNull(testFilm2.getRating());
        Assertions.assertEquals(0, testFilm2.getReplacementCost());
    }
    @Test
    void testSetters(){
        testFilm.setFilmId(203);
        testFilm.setTitle("testTitle1");
        testFilm.setDescription("testDes1");
        testFilm.setLanguageId(2);
        testFilm.setLength(51);
        testFilm.setRentalRate(2);
        testFilm.setRating("testRate1");
        testFilm.setReplacementCost(15.0);

        Assertions.assertEquals("testTitle1",testFilm.getTitle());
        Assertions.assertEquals("testDes1",testFilm.getDescription());
        Assertions.assertEquals(2,testFilm.getLanguageId());
        Assertions.assertEquals(51,testFilm.getLength());
        Assertions.assertEquals(2, testFilm.getRentalRate());
        Assertions.assertEquals("testRate1",testFilm.getRating());
        Assertions.assertEquals(15.0, testFilm.getReplacementCost());
    }

}
