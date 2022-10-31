package SakilaScam;
import javax.persistence.*;


@Table(name= "film_category")

@Entity @IdClass(Film.class)
public class Film_Category {
    @Id
    @Column(name= "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int category_id;

    @Id
    @Column(name= "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int film_id;


    public Film_Category(){

    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }
}


