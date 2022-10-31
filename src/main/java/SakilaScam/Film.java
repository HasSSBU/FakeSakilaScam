package SakilaScam;

import javax.persistence.*;

@Entity
@Table(name= "film")
public class Film {

    //Attributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int film_id;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "language_id")
    int language_id;

    @Column(name = "length")
    int length;

    @Column(name = "rental_rate")
    int rental_rate;

    @Column(name = "rating")
    String rating;

    //Constructor
    public Film(String title, String des, int lang, int len, int rent, String rate) {
        this.title = title;
        this.description = des;
        this.language_id = lang;
        this.length = len;
        this.rental_rate = rent;
        this.rating = rate;
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

    public int getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(int rental_rate) {
        this.rental_rate = rental_rate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}