package pl.jakusz.credit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jakusz.credit.model.Credit;
import pl.jakusz.credit.model.Customer;
import pl.jakusz.credit.repo.CreditRepo;
import pl.jakusz.credit.repo.CustomerRepo;

import java.util.List;
import java.util.Optional;

@Service
public class CreditServiceImp implements CreditService{

    @Autowired
    private CreditRepo creditRepo;

    @Override
    public void saveCredit(Credit credit) {
        creditRepo.save(credit);
    }

    @Override
    public List<Credit> CREDIT_LIST() {
        List<Credit> creditList = creditRepo.findAll();
        return creditList;
    }



}
