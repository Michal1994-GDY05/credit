package pl.jakusz.credit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.jakusz.credit.model.Credit;
import pl.jakusz.credit.model.Customer;
import pl.jakusz.credit.service.CreditService;
import pl.jakusz.credit.service.CustomerService;

import java.util.Optional;

@Controller
public class CreditController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CreditService creditService;

    @GetMapping("/all")
    public String index(Model model) {
        model.addAttribute("saveCustomerGetMapping", new Customer());
        return "createCredit";
    }

    @GetMapping("/allTwo")
    public String index2(Model model) {
        model.addAttribute("saveCustomerGetMapping", new Credit());
        return "cos";
    }

    @PostMapping("/addCustomer")
    public String addCustomer(@ModelAttribute Customer customer) {
        Optional<Customer> customer1 = customerService.wyszukajPoPesel(customer.getPesel());
        if(customer1.isPresent()){

            return "redirect:/allTwo";
        }
        customerService.saveCustomer(customer);
        return "redirect:/allTwo";
    }

    @PostMapping("/addC")
    public String addCredit(@ModelAttribute Credit credit) {
        creditService.saveCredit(credit);
        return "redirect:/allTwo";
    }
}
