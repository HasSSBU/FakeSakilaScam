package SakilaScam;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

    Customer findByCustomerLastName(String lastName);

}