package SakilaScam;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "film")
public class Film {

    //Attributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int film_id;

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

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "language_id")
    int language_id;

    @Column(name = "length")
    int length;

    @Column(name = "rental_rate")
    double rental_rate;

    @Column(name = "rating")
    String rating;

    @Column(name = "replacement_cost")
    double replacement_cost;

    //Constructor
    public Film(String title, String des, int lang, int len, double rent, String rate, double replacement) {
        this.title = title;
        this.description = des;
        this.language_id = lang;
        this.length = len;
        this.rental_rate = rent;
        this.rating = rate;
        this.replacement_cost = replacement;
    }

    public Film() {
    }

    //Methods

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
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

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    public double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }
}