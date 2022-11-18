package sakila.scam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FilmTest {

    Film testFilm = new Film("testTitle", "testDes", 1, 50, 1, "testRate", 20.0);
    Film testFilm2 = new Film();

    @Test
    void testGetTitle(){
        Assertions.assertEquals("testTitle",testFilm.getTitle());
    }
    @Test
    void testGetDescription(){
        Assertions.assertEquals("testDes",testFilm.getDescription());
    }
    @Test
    void testGetLanguageId(){
        Assertions.assertEquals(1,testFilm.getLanguageId());
    }
    @Test
    void testGetLength(){
        Assertions.assertEquals(50,testFilm.getLength());
    }
    @Test
    void testGetRentalRate(){
        Assertions.assertEquals(1, testFilm.getRentalRate());
    }
    @Test
    void testGetRating(){
        Assertions.assertEquals("testRate",testFilm.getRating());
    }
    @Test
    void testGetReplacemntCost(){
        Assertions.assertEquals(20.0, testFilm.getReplacementCost());
    }

    @Test
    void testSetId(){
        testFilm.setFilmId(203);
        Assertions.assertEquals("testTitle1",testFilm.getTitle());
    }
    @Test
    void testSetTitle(){
        testFilm.setTitle("testTitle1");
        Assertions.assertEquals("testTitle1",testFilm.getTitle());;
    }
    @Test
    void testSetDescription(){
        testFilm.setDescription("testDes1");
        Assertions.assertEquals("testDes1",testFilm.getDescription());
    }
    @Test
    void testSetLanguage(){
        testFilm.setLanguageId(2);
        Assertions.assertEquals(2,testFilm.getLanguageId());
    }
    @Test
    void testSetLength(){
        testFilm.setLength(51);
        Assertions.assertEquals(51,testFilm.getLength());
    }
    @Test
    void testSetRentalRate(){
        testFilm.setRentalRate(2);
        Assertions.assertEquals(2, testFilm.getRentalRate());
    }
    @Test
    void testSetRating(){
        testFilm.setRating("testRate1");
        Assertions.assertEquals("testRate1",testFilm.getRating());
    }
    @Test
    void testSetReplacemtnCost(){
        testFilm.setReplacementCost(15.0);
        Assertions.assertEquals(15.0, testFilm.getReplacementCost());
    }

}
