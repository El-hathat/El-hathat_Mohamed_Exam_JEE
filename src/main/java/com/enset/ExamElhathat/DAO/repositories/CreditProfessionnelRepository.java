package com.enset.ExamElhathat.DAO.repositories;

import com.enset.ExamElhathat.DAO.entities.CreditProfessionnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditProfessionnelRepository extends JpaRepository<CreditProfessionnel, Long> {
}

