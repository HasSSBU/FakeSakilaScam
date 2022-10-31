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

	public SakilaScamApplication(ActorRepository actorRepo){
		this.actorRepository = actorRepo;
	}
	public static void main(String[] args) {
		SpringApplication.run(SakilaScamApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}

	@PutMapping("/putActors/{id}")
	public ResponseEntity<Actor> updateActor(@PathVariable(value="id") int actor_id,
											 @Validated @RequestBody Actor actorDetails) throws ResourceAccessException {
		Actor actor = actorRepository.findById(actor_id)
				.orElseThrow(() -> new ResourceAccessException("Actor ID not found : : " + actor_id));


		actorDetails.setActor_id(actorDetails.getActor_id());
		actorDetails.setFirstName(actorDetails.getFirstName());
		actorDetails.setLastName(actorDetails.getLastName());
		final Actor updatedActor = actorRepository.save(actorDetails);
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

}
