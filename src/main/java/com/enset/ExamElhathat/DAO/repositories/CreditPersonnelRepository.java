package com.enset.ExamElhathat.DAO.repositories;

import com.enset.ExamElhathat.DAO.entities.CreditPersonnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditPersonnelRepository extends JpaRepository<CreditPersonnel, Long> {
}

