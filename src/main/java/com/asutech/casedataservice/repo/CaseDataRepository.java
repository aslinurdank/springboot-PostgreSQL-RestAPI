package com.asutech.casedataservice.repo;

import com.asutech.casedataservice.entity.CaseData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CaseDataRepository extends JpaRepository<CaseData,Long> {
   Optional<CaseData> findByEmailFieldAndNumberField(String emailField, String numberField);
}
