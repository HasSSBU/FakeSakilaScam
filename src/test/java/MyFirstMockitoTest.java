
import SakilaScam.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MyFirstMockitoTest {

    ActorRepository actorRepository = mock(ActorRepository.class);
    FilmRepository filmRepository = mock(FilmRepository.class);
    CategoryRepository categoryRepository = mock(CategoryRepository.class);
    Payment_Repository paymentReopsitory = mock(Payment_Repository.class);
    CustomerRepository customerRepository = mock(CustomerRepository.class);

    SakilaScamApplication testApp= new SakilaScamApplication(actorRepository, filmRepository, categoryRepository, paymentReopsitory,  customerRepository);

    Film testFilm1 = new Film("My Film", "About Me", 1 ,134, 2.99, "5/5", 15.99);
    Film testFilm2 = new Film("Your Film", "About You", 1 ,7, 0.49, "0/5", 0);

    List<Film> allFilms = Arrays.asList(testFilm1, testFilm2);

    @Test
    public void MockitoTest(){
        when(filmRepository.findAll()).thenReturn(allFilms);
        Iterable<Film> result = testApp.getAllFilms();
        Assertions.assertEquals(allFilms, result);
    }
}
