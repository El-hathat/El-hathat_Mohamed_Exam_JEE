package com.enset.ExamElhathat.DAO.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Remboursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private double montant;
    private String type; // "Mensualité" ou "Remboursement anticipé"

    @ManyToOne
    private Credit credit;
}

