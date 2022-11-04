package sakila.scam;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "category")
public class Category {
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int categoryId;

    @ManyToMany
    @JoinTable(
            name = "film_category",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    Set<Film> films;

    @Column(name = "name")
    String name;

    public Category(String categoryName){
        this.name = categoryName;
    }

    public Category(){
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
