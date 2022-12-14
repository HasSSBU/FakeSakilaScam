import java.lang.*;

import sakila.scam.*;
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
    PaymentRepository paymentRepo;
    @Autowired
    CustomerRepository customerRepo;
    @Autowired
    InventoryRepository inventoryRepo;
    @Autowired
    SakilaScamApplication testApp = new SakilaScamApplication(actRepo, filmRepo,categoryRepo, paymentRepo, customerRepo, inventoryRepo);
    String title;
    double rent;
    double replace;
    double total;


    @Given("a user wants to find rent a film")
    public void a_user_wants_to_find_rent_a_film() {
        title = "BASIC EASY";
        this.rent = testApp.filmRepository.findByTitle(title).getRentalRate();
        this.replace = testApp.filmRepository.findByTitle(title).getReplacementCost();

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
