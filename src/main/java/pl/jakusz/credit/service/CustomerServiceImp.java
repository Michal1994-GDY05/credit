package pl.jakusz.credit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jakusz.credit.model.Customer;
import pl.jakusz.credit.repo.CustomerRepo;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public List<Customer> CUSTOMER_LIST() {
        List<Customer> customerList = customerRepo.findAll();
        return customerList;
    }

    @Override
    public Optional<Customer> wyszukajPoPesel(String pesel) {
        return customerRepo.findByPesel(pesel);
    }
}
