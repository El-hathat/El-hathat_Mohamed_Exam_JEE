package com.enset.ExamElhathat.Web.Controller;


import com.enset.ExamElhathat.DAO.entities.*;
import com.enset.ExamElhathat.DAO.repositories.ClientRepository;
import com.enset.ExamElhathat.DAO.repositories.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credits")
public class CreditController {
@Autowired
    private CreditRepository creditRepository;
    @Autowired
    private ClientRepository clientRepository;



    @PostMapping("/personnel")
    public CreditPersonnel saveCreditPersonnel(@RequestBody CreditPersonnel credit) {
        return (CreditPersonnel) creditRepository.save(prepareCredit(credit));
    }

    @PostMapping("/immobilier")
    public CreditImmobilier saveCreditImmobilier(@RequestBody CreditImmobilier credit) {
        return (CreditImmobilier) creditRepository.save(prepareCredit(credit));
    }

    @PostMapping("/professionnel")
    public CreditProfessionnel saveCreditProfessionnel(@RequestBody CreditProfessionnel credit) {
        return (CreditProfessionnel) creditRepository.save(prepareCredit(credit));
    }

    @GetMapping("/client/{clientId}")
    public List<Credit> getCreditsByClient(@PathVariable Long clientId) {
        return creditRepository.findByClientId(clientId);
    }

    private Credit prepareCredit(Credit credit) {
        Long clientId = credit.getClient().getId();
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new RuntimeException("Client introuvable"));
        credit.setClient(client);
        return credit;
    }
}
