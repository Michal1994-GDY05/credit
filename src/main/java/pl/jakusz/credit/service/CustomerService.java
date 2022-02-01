package pl.jakusz.credit.service;

import pl.jakusz.credit.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer saveCustomer(Customer customer);
    List<Customer> CUSTOMER_LIST();
    Optional<Customer> wyszukajPoPesel(String pesel);

}
