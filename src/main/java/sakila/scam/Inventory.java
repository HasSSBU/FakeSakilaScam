package sakila.scam;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "inventory")
public class Inventory {

    @Id
    @Column(name = "inventory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int inventoryId;

    @OneToMany(mappedBy="inventory")
    private Set<Rental> rental;

    @ManyToOne
    @JoinColumn(name= "film_id")
    private Film film;

    public Inventory(){
        //Constructor does not need arguments
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

}
