package SakilaScam;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "payment")
public class Payment {
    @Id
    @Column(name = "payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int film_id;

    @ManyToOne
    @JoinColumn(name= "customer_id")
    private Customer customer;


    @Column(name = "amount")
    double amount;

    public Payment(){

    }

    public Payment(double amount){
        this.amount = amount;
    }

    public int getFilm_id() {
        return film_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
