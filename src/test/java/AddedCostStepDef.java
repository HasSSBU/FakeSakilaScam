import java.lang.*;

import SakilaScam.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class AddedCostStepDef {

    @Autowired
    ActorRepository actRepo;
    @Autowired
    FilmRepository filmRepo;
    CategoryRepository categoryRepo;
    @Autowired
    Payment_Repository paymentRepo;
    @Autowired
    CustomerRepository customerRepo;
    @Autowired
    SakilaScamApplication testApp = new SakilaScamApplication(actRepo, filmRepo,categoryRepo, paymentRepo, customerRepo);
    String title;
    double rent;
    double replace;
    double total;


    @Given("a user wants to find rent a film")
    public void a_user_wants_to_find_rent_a_film() {
        title = "BASIC EASY";
        this.rent = testApp.filmRepository.findByTitle(title).getRental_rate();
        this.replace = testApp.filmRepository.findByTitle(title).getReplacement_cost();

    }
    @When("a user types purchases a film")
    public void a_user_types_purchases_a_film() {
        total = this.rent + this.replace;

    }
    @Then("they see the extra costs of the film")
    public void they_see_the_extra_costs_of_the_film() {
        Assertions.assertEquals(total, 2.99 + 18.99);

    }
}
