package com.enset.ExamElhathat.DTO;

import lombok.Data;

import java.time.LocalDate;
@Data
public class RemboursementDTO {
    private Long id;
    private LocalDate date;
    private double montant;
    private String type;
    private Long creditId;
}

