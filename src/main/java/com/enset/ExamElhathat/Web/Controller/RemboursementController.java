package com.enset.ExamElhathat.Web.Controller;

import com.enset.ExamElhathat.DAO.entities.Credit;
import com.enset.ExamElhathat.DAO.entities.Remboursement;
import com.enset.ExamElhathat.DAO.repositories.CreditRepository;
import com.enset.ExamElhathat.DAO.repositories.RemboursementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/remboursements")
public class RemboursementController {

    @Autowired
    private RemboursementRepository remboursementRepository;
    @Autowired
    private CreditRepository creditRepository;



    @PostMapping
    public Remboursement save(@RequestBody Remboursement remboursement) {
        Long creditId = remboursement.getCredit().getId();
        Credit credit = creditRepository.findById(creditId)
                .orElseThrow(() -> new RuntimeException("Crédit introuvable"));
        remboursement.setCredit(credit);
        return remboursementRepository.save(remboursement);
    }

    @GetMapping("/credit/{creditId}")
    public List<Remboursement> getByCredit(@PathVariable Long creditId) {
        return remboursementRepository.findByCreditId(creditId);
    }
}

