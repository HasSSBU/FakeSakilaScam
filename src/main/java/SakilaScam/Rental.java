package SakilaScam;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Rental {

    @Id
    @Column(name = "inventory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int inventory_id;

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customer_id;

    @Id
    @Column(name= "staff_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int staff_id;

    @Id
    @Column(name= "rental_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int rental_id;

    @Column(name = "rental_date")
    String rental_date;
    @Column(name = "payment_date")
    String payment_date;

    public Rental(int invent,int customer,int staff,int rental,String rentalDate,String payDate){
        this.inventory_id = invent;
        this.customer_id = customer;
        this.staff_id = staff;
        this.rental_id = rental;
        this.rental_date = rentalDate;
        this.payment_date = payDate;
    }

    public Rental(){
    }

    public int getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(int inventory_id) {
        this.inventory_id = inventory_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
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

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }
}
