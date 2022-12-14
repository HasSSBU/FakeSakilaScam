package sakila.scam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/Home")
@CrossOrigin(origins ={"http://localhost:8080","http://localhost:3000"})
public class SakilaScamApplication {

	@Autowired
	public final ActorRepository actorRepository;
	public final FilmRepository filmRepository;
	public final CategoryRepository categoryRepository;
	public final PaymentRepository paymentRepository;
	public final CustomerRepository customerRepository;

	public final InventoryRepository inventoryRepository;


	public SakilaScamApplication(ActorRepository actorRepo, FilmRepository filmRepo, CategoryRepository categoryRepo, PaymentRepository paymentReop,
								 CustomerRepository customerRepo, InventoryRepository inventoryRepo){
		this.actorRepository = actorRepo;
		this.filmRepository = filmRepo;
		this.categoryRepository = categoryRepo;
		this.paymentRepository = paymentReop;
		this.customerRepository = customerRepo;
		this.inventoryRepository = inventoryRepo;

	}
	public static void main(String[] args) {
		SpringApplication.run(SakilaScamApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepository.findAll();
	}

	@GetMapping("/allCategories")
	public @ResponseBody
	List<Category> getAllCategories(){
		return categoryRepository.findAll();
	}


	@GetMapping("/allPayments")
	public @ResponseBody
	List<Payment> getAllPayments(){
		return paymentRepository.findAll();
	}


	@GetMapping("/allCustomers")
	public @ResponseBody
	List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}

	@GetMapping("/Film/{id}")
	public @ResponseBody
	Optional<Film> getFilm(@PathVariable(value="id") Integer id){
		return filmRepository.findById(id);
	}

	@GetMapping("/FilmName/{name}")
	public @ResponseBody
	String getFilmByName(@PathVariable(value="name") String name){
		Film film = filmRepository.findByTitle(name);
		return film.getTitle();
	}

    @GetMapping("/Actor/{id}")
    public @ResponseBody
    Optional<Actor> getActor(@PathVariable(value="id") Integer id){
        return actorRepository.findById(id);
    }

	@PutMapping("/putActors/{id}")
	public Actor updateActor(@PathVariable(value="id") Integer id,
											 @RequestBody ActorModel actorModelDetails) {
		Actor actorDetails = new Actor(actorModelDetails.getFirstName(), actorModelDetails.getLastName());
		Actor actor = actorRepository.findById(id)
				.orElseThrow(() -> new ResourceAccessException("Actor ID not found : : " + id));

		actor.setFirstName(actorDetails.getFirstName());
		actor.setLastName(actorDetails.getLastName());
		return actorRepository.save(actor);
	}

	@DeleteMapping("/Delete/{id}")
	public Map<String, Boolean> deleteActor(@PathVariable(value = "id") int actorId)
			throws ResourceAccessException {
		Actor actorHere = actorRepository.findById(actorId)
				.orElseThrow(() -> new ResourceAccessException("Employee not found for this id :: " + actorId));

		actorRepository.delete(actorHere);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	@PostMapping("/Actor")
	public Actor createActor(@RequestBody ActorModel newActorModel) {
		Actor newActor = new Actor(newActorModel.getFirstName(), newActorModel.getLastName());
		return actorRepository.save(newActor);
	}


	@GetMapping("/Costs/{name}")
	public @ResponseBody
	double getCostOfFilm(@PathVariable(value="name") String name){
		Film film = filmRepository.findByTitle(name);
		return film.getRentalRate() + film.getReplacementCost();
	}

	@PostMapping("/addPayment")
	public Payment addPayment(@RequestBody PaymentModel newPaymentModel) {
		Payment newPayment = new Payment(newPaymentModel.getAmount());
		return paymentRepository.save(newPayment);
	}

}
