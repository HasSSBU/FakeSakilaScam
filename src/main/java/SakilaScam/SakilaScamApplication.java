package SakilaScam;

import org.apache.maven.wagon.ResourceDoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/Home")
@CrossOrigin
public class SakilaScamApplication {

	@Autowired
	private ActorRepository actorRepository;
	private FilmRepository filmRepository;

	public SakilaScamApplication(ActorRepository actorRepo, FilmRepository filmRepo){
		this.actorRepository = actorRepo;
		this.filmRepository = filmRepo;
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



	@PutMapping("/putActors/{id}")
	public ResponseEntity<Actor> updateActor(@PathVariable(value="id") Integer id,
											 @RequestBody Actor actorDetails) {

		Actor actor = actorRepository.findById(id)
				.orElseThrow(() -> new ResourceAccessException("Actor ID not found : : " + id));

		actor.setFirstName(actorDetails.getFirstName());
		actor.setLastName(actorDetails.getLastName());
		final Actor updatedActor = actorRepository.save(actor);
		return ResponseEntity.ok(updatedActor);
	}

	@DeleteMapping("/Delete/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") int actor_id)
			throws ResourceAccessException {
		Actor actorHere = actorRepository.findById(actor_id)
				.orElseThrow(() -> new ResourceAccessException("Employee not found for this id :: " + actor_id));

		actorRepository.delete(actorHere);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	@PostMapping("/Actor")
	public Actor createActor(@RequestBody Actor newActor) {
		return actorRepository.save(newActor);
	}

}
