package SakilaScam;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Payment {

    @Id
    @Column(name = "payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int payment_id;

    @Column(name = "customer_id")
    int customer_id;

    @Column(name= "staff_id")
    int staff_id;

    @Column(name= "rental_id")
    int rental_id;

    @Column(name = "amount")
    double amount;

    @Column(name = "payment_date")
    String payment_date;

    public Payment(int payment,int customer,int staff,int rental,double amount,String payDate){
        this.payment_id = payment;
        this.customer_id = customer;
        this.staff_id = staff;
        this.rental_id = rental;
        this.amount = amount;
        this.payment_date = payDate;
    }

    public Payment(){
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }
}