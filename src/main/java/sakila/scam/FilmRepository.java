package sakila.scam;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FilmRepository  extends JpaRepository<Film, Integer>{
    Film findByTitle(String title);


}
