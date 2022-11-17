import java.lang.*;
import sakila.scam.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.Collection;


public class ViewAllFilmsStepDef{

    @Autowired
    ActorRepository actRepo;
    @Autowired
    FilmRepository filmRepo;
    @Autowired
    CategoryRepository categoryRepo;
    @Autowired
    PaymentRepository paymentRepo;
    @Autowired
    CustomerRepository customerRepo;
    @Autowired
    InventoryRepository inventoryRepo;
    @Autowired
    SakilaScamApplication testApp = new SakilaScamApplication(actRepo, filmRepo,categoryRepo,paymentRepo,customerRepo,inventoryRepo);
    ArrayList<Film> expectedResult;
    ArrayList<Film> actualResult;

    @Given("a user wants to see all the films")
    public void a_user_wants_to_see_all_the_films() {
        this.expectedResult = new ArrayList<>(filmRepo.findAll());

    }
    @When("a user visits the webpage")
    public void a_user_visits_the_webpage() {
        this.actualResult = new ArrayList<>((Collection) testApp.getAllFilms());

    }
    @Then("they see the catalogue of films")
    public void they_see_the_catalogue_of_the_films() {
        Assertions.assertEquals(this.expectedResult.size(), this.actualResult.size());

    }
}