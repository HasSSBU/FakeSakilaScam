package SakilaScam;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

    Actor findByLastName(String lastName);

}
