package SakilaScam;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "actor")
public class Actor {

    //Attributes
    @Id
    @Column(name= "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorId;

    @ManyToMany
    @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    Set<Actor> films;

    @Column(name= "first_name")
    String firstName;

    @Column(name= "last_name")
    String lastName;

    //Constructor
    public Actor(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    public Actor(){

    }

    //Methods
    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
