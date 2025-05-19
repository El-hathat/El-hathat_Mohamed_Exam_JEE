package com.enset.ExamElhathat;

import com.enset.ExamElhathat.DAO.entities.*;
import com.enset.ExamElhathat.DAO.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInit implements CommandLineRunner {

    @Autowired
    private  ClientRepository clientRepository;
    @Autowired
    private  CreditPersonnelRepository creditPersonnelRepository;
    @Autowired
    private  CreditImmobilierRepository creditImmobilierRepository;
    @Autowired
    private  CreditProfessionnelRepository creditProfessionnelRepository;
    @Autowired
    private  RemboursementRepository remboursementRepository;

    public DataInit(
            ClientRepository clientRepository,
            CreditPersonnelRepository creditPersonnelRepository,
            CreditImmobilierRepository creditImmobilierRepository,
            CreditProfessionnelRepository creditProfessionnelRepository,
            RemboursementRepository remboursementRepository
    ) {
        this.clientRepository = clientRepository;
        this.creditPersonnelRepository = creditPersonnelRepository;
        this.creditImmobilierRepository = creditImmobilierRepository;
        this.creditProfessionnelRepository = creditProfessionnelRepository;
        this.remboursementRepository = remboursementRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Création client
        Client client = new Client();
        client.setNom("Ali Ben Salah");
        client.setEmail("ali.bensalah@example.com");
        clientRepository.save(client);

        // Crédit personnel
        CreditPersonnel cp = new CreditPersonnel();
        cp.setClient(client);
        cp.setDateDemande(LocalDate.now());
        cp.setStatut("EN_COURS");
        cp.setMontant(15000);
        cp.setDuree(24);
        cp.setTauxInteret(3.5);
        cp.setMotif("Achat voiture");
        creditPersonnelRepository.save(cp);

        // Crédit immobilier
        CreditImmobilier ci = new CreditImmobilier();
        ci.setClient(client);
        ci.setDateDemande(LocalDate.now());
        ci.setStatut("ACCEPTE");
        ci.setDateAcception(LocalDate.now());
        ci.setMontant(200000);
        ci.setDuree(240);
        ci.setTauxInteret(2.9);
        ci.setTypeBien("Maison");
        creditImmobilierRepository.save(ci);

        // Crédit professionnel
        CreditProfessionnel cp2 = new CreditProfessionnel();
        cp2.setClient(client);
        cp2.setDateDemande(LocalDate.now());
        cp2.setStatut("REJETE");
        cp2.setMontant(50000);
        cp2.setDuree(36);
        cp2.setTauxInteret(4.2);
        cp2.setMotif("Extension entreprise");
        cp2.setRaisonSociale("Tech Innov SARL");
        creditProfessionnelRepository.save(cp2);

        // Remboursement
        Remboursement r = new Remboursement();
        r.setCredit(cp);
        r.setDate(LocalDate.now());
        r.setMontant(625.0);
        r.setType("Mensualité");
        remboursementRepository.save(r);
    }
}

