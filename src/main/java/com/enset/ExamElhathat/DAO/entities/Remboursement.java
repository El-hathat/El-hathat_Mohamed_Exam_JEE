package com.enset.ExamElhathat.DAO.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
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

