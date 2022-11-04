package SakilaScam;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "customer")
public class Customer {

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerId;

    @OneToMany(mappedBy="customer")
    private Set<Payment> payment;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "email")
    String email;


    public Customer(String fName, String lName, String email){
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
    }
    public Customer (){

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customer_id) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
