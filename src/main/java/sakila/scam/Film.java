package sakila.scam;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "film")
public class Film {

    //Attributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmId;

    @ManyToMany
    @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    Set<Actor> names;

    @ManyToMany
    @JoinTable(
            name = "film_category",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    Set<Category> categories;

    @OneToMany(mappedBy="film")
    private Set<Inventory> inventory;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "language_id")
    int languageId;

    @Column(name = "length")
    int length;

    @Column(name = "rental_rate")
    double rentalRate;

    @Column(name = "rating")
    String rating;

    @Column(name = "replacement_cost")
    double replacementCost;


    //Constructor
    public Film(String title, String des, int lang, int len, double rent, String rate, double replacement) {
        this.title = title;
        this.description = des;
        this.languageId = lang;
        this.length = len;
        this.rentalRate = rent;
        this.rating = rate;
        this.replacementCost = replacement;
    }

    public Film() {
    }

    //Methods

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    public double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }
}