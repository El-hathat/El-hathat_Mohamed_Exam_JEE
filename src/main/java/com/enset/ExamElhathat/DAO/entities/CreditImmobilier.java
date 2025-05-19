package com.enset.ExamElhathat.DAO.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("IMMOBILIER")
public class CreditImmobilier extends Credit {
    private String typeBien; // "Appartement", "Maison", "Local Commercial"
}

