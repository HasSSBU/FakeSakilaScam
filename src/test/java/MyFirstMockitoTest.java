import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sakila.scam.*;

import java.util.*;

import static org.mockito.Mockito.*;

class MyFirstMockitoTest {

    ActorRepository actorRepository = mock(ActorRepository.class);
    FilmRepository filmRepository = mock(FilmRepository.class);
    CategoryRepository categoryRepository = mock(CategoryRepository.class);
    PaymentRepository paymentRepository = mock(PaymentRepository.class);
    CustomerRepository customerRepository = mock(CustomerRepository.class);
    InventoryRepository inventoryRepository = mock(InventoryRepository.class);

    SakilaScamApplication testApp= new SakilaScamApplication(actorRepository, filmRepository, categoryRepository, paymentRepository,
            customerRepository, inventoryRepository);

    Film testFilm1 = new Film("My Film", "About Me", 1 ,134, 2.99, "5/5", 15.99);
    Film testFilm2 = new Film("Your Film", "About You", 1 ,7, 0.49, "0/5", 0);
    Actor testActor1 = new Actor("Harry", "Johnson");
    Actor testActor2 = new Actor("Nota", "Name");
    Category testCategory1 = new Category("Action");
    Category testCategory2 = new Category("Animation");

    Customer testCustomer1 = new Customer("Hugh", "Jazz", "HughJazz@JennaTools.com");
    Customer testCustomer2 = new Customer("Ben", "Dover", "BenDover@JennaTools.com");
    Payment paymentTest1 = new Payment(10.50);
    Payment paymentTest2 = new Payment(3.50);

    List<Film> allFilms = Arrays.asList(testFilm1, testFilm2);
    List<Actor> allActors = Arrays.asList(testActor1,testActor2);
    List<Category> allCategories = Arrays.asList(testCategory1,testCategory2);
    List<Customer> allCustomers = Arrays.asList(testCustomer1,testCustomer2);
    List<Payment> allPayments = Arrays.asList(paymentTest1,paymentTest2);



    @Test
    void GetMapTestFilms(){
        when(filmRepository.findAll()).thenReturn(allFilms);
        Iterable<Film> result = testApp.getAllFilms();
        Assertions.assertEquals(allFilms, result);
    }

    @Test
    void getMapTestActors(){
        when(actorRepository.findAll()).thenReturn(allActors);
        Iterable<Actor> result = testApp.getAllActors();
        Assertions.assertEquals(allActors, result);
    }

    @Test
    void getMapTestCategories(){
        when(categoryRepository.findAll()).thenReturn(allCategories);
        Iterable<Category> result = testApp.getAllCategories();
        Assertions.assertEquals(allCategories, result);
    }
    @Test
    void getMapTestCustomers(){
        when(customerRepository.findAll()).thenReturn(allCustomers);
        Iterable<Customer> result = testApp.getAllCustomers();
        Assertions.assertEquals(allCustomers, result);
    }
    @Test
    void getMapTestPayments(){
        when(paymentRepository.findAll()).thenReturn(allPayments);
        Iterable<Payment> result = testApp.getAllPayments();
        Assertions.assertEquals(allPayments, result);
    }

    @Test
    void testGetMapFilmByName(){
        when(filmRepository.findByTitle("My Film")).thenReturn(testFilm1);
        String result = testApp.getFilmByName("My Film");
        Assertions.assertEquals(testFilm1.getTitle(), result);
    }

    @Test
    void testGetMapFilmById(){
        testFilm2.setFilmId(1);
        Optional<Film> searchedFilmId = Optional.of(testFilm2);
        when(filmRepository.findById(1)).thenReturn(searchedFilmId);
        Optional<Film> result = testApp.getFilm(1);
        Assertions.assertEquals(searchedFilmId, result);
    }

    @Test
    void testPutMapActor(){
        testActor2.setActorId(2);
        ActorModel actorToUpdate = new ActorModel("John","Cena");
        Actor actorUpdate = new Actor(actorToUpdate.getFirstName(),actorToUpdate.getLastName());
        when(actorRepository.save(any(Actor.class))).thenReturn(actorUpdate);
        when(actorRepository.findById(2)).thenReturn(Optional.ofNullable(testActor2));
        Actor updated = testApp.updateActor(2, actorToUpdate);
        Assertions.assertEquals(updated, actorUpdate);
    }

    @Test
    void testDeleteActor(){
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        when(actorRepository.findById(2)).thenReturn(Optional.ofNullable(testActor2));
        Map<String, Boolean> result = testApp.deleteActor(2);
        Assertions.assertEquals(result,response);
    }

    @Test
    void testPostMapActor(){
        ActorModel actorModelUpdate = new ActorModel("The Rock", "Johnson");
        Actor actorUpdate = new Actor(actorModelUpdate.getFirstName(), actorModelUpdate.getLastName());
        when(actorRepository.save(any(Actor.class))).thenReturn(actorUpdate);
        when(actorRepository.getReferenceById(3)).thenReturn(actorUpdate);
        testApp.createActor(actorModelUpdate);
        Assertions.assertEquals(actorUpdate, testApp.actorRepository.getReferenceById(3));
    }

    @Test
    void testTotalCostOfFilm(){
        when(filmRepository.findByTitle("My Film")).thenReturn(testFilm1);
        Film testFilm = filmRepository.findByTitle("My Film");
        double expectedResult = testFilm.getReplacementCost()+testFilm.getRentalRate();
        double actualResult = testApp.getCostOfFilm("My Film");
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testPostMapPayment(){
        PaymentModel paymentModelUpdate = new PaymentModel(20.99);
        Payment testPayment = new Payment(paymentModelUpdate.getAmount());
        when(paymentRepository.save(any(Payment.class))).thenReturn(testPayment);
        Payment result = testApp.addPayment(paymentModelUpdate);
        Assertions.assertEquals(testPayment, result);
    }
}
