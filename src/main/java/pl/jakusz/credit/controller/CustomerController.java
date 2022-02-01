package pl.jakusz.credit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.jakusz.credit.model.Customer;
import pl.jakusz.credit.service.CreditService;
import pl.jakusz.credit.service.CustomerService;

import java.util.List;

public class CustomerController {

    @Autowired
    private CustomerService customerService;

}
