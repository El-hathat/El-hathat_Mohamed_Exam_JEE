package com.enset.ExamElhathat.DAO.repositories;

import com.enset.ExamElhathat.DAO.entities.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Long> {
    List<Credit> findByClientId(Long clientId);
    List<Credit> findByStatut(String statut);
    List<Credit> findByDateDemandeBetween(LocalDate start, LocalDate end);

}

