package SakilaScam;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name= "actor")
public class Actor {

    //Attributes
    @Id
    @Column(name= "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actor_id;

    @ManyToMany
    @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    Set<Actor> films;

    @Column(name= "first_name")
    String first_name;

    @Column(name= "last_name")
    String last_name;

    //Constructor
    public Actor(String fName, String lName){
        this.first_name = fName;
        this.last_name = lName;
    }

    public Actor(){

    }

    //Methods
    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }


    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

}
