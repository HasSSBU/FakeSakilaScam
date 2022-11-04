package SakilaScam;

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
@CrossOrigin("http://localhost:8080")
public class SakilaScamApplication {

	@Autowired
	public ActorRepository actorRepository;
	public FilmRepository filmRepository;
	public CategoryRepository categoryRepository;
	public Payment_Repository paymentRepository;
	public CustomerRepository customerRepository;

	public SakilaScamApplication(ActorRepository actorRepo, FilmRepository filmRepo, CategoryRepository categoryRepo, Payment_Repository paymentReop, CustomerRepository customerRepo){
		this.actorRepository = actorRepo;
		this.filmRepository = filmRepo;
		this.categoryRepository = categoryRepo;
		this.paymentRepository = paymentReop;
		this.customerRepository = customerRepo;
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

	@PutMapping("/putActors/{id}")
	public Actor updateActor(@PathVariable(value="id") Integer id,
											 @RequestBody ActorModel actorModelDetails) {
		Actor actorDetails = new Actor(actorModelDetails.getFirst_name(), actorModelDetails.getLast_name());
		Actor actor = actorRepository.findById(id)
				.orElseThrow(() -> new ResourceAccessException("Actor ID not found : : " + id));

		actor.setFirstName(actorDetails.getFirstName());
		actor.setLastName(actorDetails.getLastName());
		return actorRepository.save(actor);
	}

	@DeleteMapping("/Delete/{id}")
	public Map<String, Boolean> deleteActor(@PathVariable(value = "id") int actor_id)
			throws ResourceAccessException {
		Actor actorHere = actorRepository.findById(actor_id)
				.orElseThrow(() -> new ResourceAccessException("Employee not found for this id :: " + actor_id));

		actorRepository.delete(actorHere);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	@PostMapping("/Actor")
	public Actor createActor(@RequestBody ActorModel newActorModel) {
		Actor newActor = new Actor(newActorModel.getFirst_name(), newActorModel.getLast_name());
		return actorRepository.save(newActor);
	}


	@GetMapping("/Costs/{name}")
	public @ResponseBody
	double getCostOfFilm(@PathVariable(value="name") String name){
		Film film = filmRepository.findByTitle(name);
		return film.getRental_rate() + film.getReplacement_cost();
	}

}
