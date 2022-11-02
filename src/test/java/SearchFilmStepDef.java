import java.lang.*;

import SakilaScam.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;




public class SearchFilmStepDef{

    @Autowired
    ActorRepository actRepo;
    @Autowired
    FilmRepository filmRepo;
    CategoryRepository categoryRepo;
    @Autowired
    SakilaScamApplication testApp = new SakilaScamApplication(actRepo, filmRepo,categoryRepo);
    String title;
    String result;

    @Given("a user wants to find a specific film")
    public void a_user_wants_to_find_a_specific_film() {
        title = "ACE GOLDFINGER";

    }
    @When("a user types in the id of a film")
    public void a_user_types_in_the_id_of_a_film() {
        this.result = testApp.filmRepository.findByTitle(title).getTitle();

    }
    @Then("they see the details of the film")
    public void they_see_the_details_of_the_film() {
        Assertions.assertEquals(this.result, "ACE GOLDFINGER");

    }
}