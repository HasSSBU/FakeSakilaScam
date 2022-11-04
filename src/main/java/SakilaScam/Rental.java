package SakilaScam;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "rental")
public class Rental {

    @Id
    @Column(name = "rental_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int rental_id;

    @ManyToOne
    @JoinColumn(name= "inventory_id")
    private Inventory inventory;

    @OneToMany(mappedBy="rental")
    private Set<Payment> payment;

    @Column(name = "rental_date")
    String rental_date;

    @Column(name = "return_date")
    String return_date;

    public Rental(String rentDate, String returnDate){
        this.rental_date = rentDate;
        this.return_date = returnDate;
    }

    public Rental(){

    }

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }
    public String getRental_date() {
        return rental_date;
    }

    public void setRental_date(String rental_date) {
        this.rental_date = rental_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }
}
