package SakilaScam;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "rental")
public class Rental {

    @Id
    @Column(name = "rental_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int rentalId;

    @ManyToOne
    @JoinColumn(name= "inventory_id")
    private Inventory inventory;

    @OneToMany(mappedBy="rental")
    private Set<Payment> payment;

    @Column(name = "rental_date")
    String rentalDate;

    @Column(name = "return_date")
    String returnDate;

    public Rental(String rentDate, String returnDate){
        this.rentalDate = rentDate;
        this.returnDate = returnDate;
    }

    public Rental(){

    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }
    public String getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(String rentalDate) {
        this.rentalDate = rentalDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
