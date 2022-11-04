package SakilaScam;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "inventory")
public class Inventory {

    @Id
    @Column(name = "inventory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int inventory_id;

    @OneToMany(mappedBy="inventory")
    private Set<Rental> rental;

    @ManyToOne
    @JoinColumn(name= "film_id")
    private Film film;

    public Inventory(){
    }

    public int getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(int inventory_id) {
        this.inventory_id = inventory_id;
    }

}
