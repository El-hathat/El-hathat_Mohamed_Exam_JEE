package com.enset.ExamElhathat.DAO.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("PERSONNEL")
public class CreditPersonnel extends Credit {
    private String motif; // exemple : voiture, études, etc.
}

