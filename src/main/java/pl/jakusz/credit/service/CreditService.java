package pl.jakusz.credit.service;

import pl.jakusz.credit.model.Credit;
import pl.jakusz.credit.model.Customer;

import java.util.List;

public interface CreditService {

    void saveCredit(Credit credit);
    List<Credit> CREDIT_LIST();


}
